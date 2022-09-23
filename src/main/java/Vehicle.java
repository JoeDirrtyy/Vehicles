public abstract class Vehicle extends Product {
    private int qty;
    private double price;
    private Engine engine;
    private final double tax =.15;
    private float speed;

    public Vehicle(String name, double tax){
        super(name);
    }

    public double getTax() {
        return tax;
    }

    public int getQty() {

        return qty;
    }

    public void setQty(int qty) {

        this.qty = qty;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }
}
