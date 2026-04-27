package com.infytel.dao;

import com.infytel.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class CustomerDAOImpl implements CustomerDAO {

    private static Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    @Override
    public void insert(Customer customer) {
        try (FileInputStream fis = new FileInputStream("resources/application.properties");) {
            Properties properties = new Properties();
            properties.load(fis);
            String jdbcDriver = (String) properties.get("JDBC_Driver");
            String jdbcUrl = (String) properties.get("JDBC_URL");
            String user = (String) properties.get("USER");
            String password = (String) properties.get("PASSWORD");
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(jdbcUrl);
            String query = "insert into customer values(?,?,?,?,?,?)";
            stmt = con.prepareStatement(query);
            stmt.setLong(1, customer.getPhoneNumber());
            stmt.setString(2, customer.getName());
            stmt.setInt(3, customer.getAge());
            stmt.setString(4, customer.getGender().toString());
            stmt.setString(5, customer.getAddress());
            stmt.setInt(6, customer.getPlanId());
            stmt.executeUpdate();
            logger.info("Record inserted");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException sqlException) {
                logger.error(sqlException.getMessage(), sqlException);
            }

        }
    }

    @Override
    public int remove(Long phoneNo) {
        int result = 1;
        try (FileInputStream fis = new FileInputStream("resources/application.properties");) {
            Properties p = new Properties();
            p.load(fis);
            String dname = (String) p.get("JDBC_DRIVER");
            String url = (String) p.get("JDBC_URL");
            String username = (String) p.get("USER");
            String password = (String) p.get("PASSWORD");
            Class.forName(dname);
            con = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM Customer WHERE phone_no = ?";
            stmt = con.prepareStatement(query);
            stmt.setLong(1, phoneNo);
            result = stmt.executeUpdate();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return result;
    }
}
