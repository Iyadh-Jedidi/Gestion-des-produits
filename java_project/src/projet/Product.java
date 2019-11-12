
package projet;

public class Product {
private int id;
private String name;
private float price;
private byte[] picture;
private String addDate;

    public Product(int id, String name, float price, String addDate, byte[] image) {
        this.id = id;
        this.name = name;
        this.price = price;
         this.addDate = addDate;
        this.picture = image;
       
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public byte[] getImage() {
        return picture;
    }

    public String getDate() {
        return addDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public void setDate(String addDate) {
        this.addDate = addDate;
    }

    
    
    
}