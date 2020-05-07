/*
package com.netcracker.service;

import com.netcracker.entity.Shops;
import com.netcracker.jdbc.JDBCConnection;
import com.netcracker.model.Shop;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ShopsInsertService {

    JDBCConnection jdbcConnection;

    public ShopsInsertService(JDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public void addShop(Shop shop) {
        //List<Employee> employeeList = new ArrayList<>();

        Connection connection = jdbcConnection.getConnection();
        String sql = "INSERT INTO shops values("+shop.getId()+",\''"+shop.getName()+"\',\'"+shop.getDistrict()+"\',\'"+shop.getComission()+");";

        try {
            Statement statement = connection.createStatement();

            statement.executeQuery(sql);



        }

        catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
*/
