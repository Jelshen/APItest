package com.backend.apitest;

public class Data {
    private int id;
    private String productID;
    private String productName;
    private int amount;
    private String customerName;
    private int status;
    private String transactionDate;
    private String createBy;
    private String createOn;


    public int getId() { return this.id;}
    public void setId(int id) { this.id = id;}

    public String getProductID() { return this.productID; }
    public void setProductID(String productId) { this.productID = productId; }

    public String getProductName() { return this.productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getAmount() { return this.amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public String getCustomerName() { return this.customerName; }
    public void setCustomerName(String name) { this.customerName = name; }

    public int getStatus() { return this.status; }
    public void setStatus(int status) { this.status = status; }

    public String getTransactionDate() { return this.transactionDate; }
    public void setTransactionDate(String transactionDate) { this.transactionDate = transactionDate; }

    public String getCreateBy() { return this.createBy; }
    public void setCreateBy(String createBy) { this.createBy = createBy; }

    public String getCreateOn() { return this.createOn; }
    public void setCreateOn(String createOn) { this.createOn = createOn; }
}
