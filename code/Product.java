package code;
public class Product{
    int id,quantity;
    String name,desription;
    public Product(int id, int quantity, String name, String desription) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.desription = desription;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesription() {
        return desription;
    }
    public void setDesription(String desription) {
        this.desription = desription;
    }
    
}