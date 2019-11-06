package hello.model;

/**
 * Created by BudaiK on Nov, 2019.
 */
public class Device {

    private int id;
    private String name;
    private String type;
    private double price;
    private String link;

    public Device(int id, String name, String type, double price, String link) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
