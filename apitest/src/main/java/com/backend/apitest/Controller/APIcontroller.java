package com.backend.apitest.Controller;

import com.backend.apitest.Data;
import com.backend.apitest.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class APIcontroller {

    @GetMapping("/read")
    public List<Data> getProduct() {
        List<Data> results = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/backendtest";
        String username = "jels";
        String password = "backendtest";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM datas";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                int id = rs.getInt("id");
                String productID = rs.getString("productID");
                String productName = rs.getString("productName");
                int amount = rs.getInt("amount");
                String customerName = rs.getString("customerName");
                int status = rs.getInt("status");
                String transactionDate = rs.getString("transactionDate");
                String createBy = rs.getString("createBy");
                String createOn = rs.getString("createOn");

                // create new Data class object and store information
                Data newData = new Data();
                newData.setId(id);
                newData.setProductID(productID);
                newData.setProductName(productName);
                newData.setAmount(amount);
                newData.setCustomerName(customerName);
                newData.setStatus(status);
                newData.setTransactionDate(transactionDate);
                newData.setCreateBy(createBy);
                newData.setCreateOn(createOn);

                // add to arraylist
                results.add(newData);

                //System.out.println(id);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return results;
    }
}
