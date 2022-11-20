package Shop;

public class Clothing {
    private String description;
    private double price;
    private String size;

    //Constants
    final int MIN_PRICE=10;
    final double TAX_RATE=0.2;
    String[] Clothing;

    public Clothing(String description ,double price,String size) {
        this.description=description;
        this.price=price;
        this.size=size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (this.price>MIN_PRICE) ? this.price:MIN_PRICE;
    }
}
