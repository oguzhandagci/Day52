public class Product {
    private String name;
    private double cost;
    private int quantity;

    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String printProduct() {
        return (name + " costs " + cost + " and " + quantity + " units were purchased");
    }

    ;

    public String totalCost() {
        return ("Total cost is " + cost * quantity);
    }
}