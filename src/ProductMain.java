public class ProductMain {
    public static void main(String[] args) {
        Product gas = new Product("Gallon of gas", 4.0, 10);
        System.out.println(gas.printProduct());
        System.out.println(gas.totalCost());
    }
}
