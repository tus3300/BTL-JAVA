package code;

import java.util.ArrayList;
import java.util.List;

public class Order{
    int id;
    String customerName,phone,email;
    List<Orderdetail> orderdetails = new ArrayList<Orderdetail>() {
        
    };
    public Order(int id, String customerName, String phone, String email) {
        this.id = id;
        this.customerName = customerName;
        this.phone = phone;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}