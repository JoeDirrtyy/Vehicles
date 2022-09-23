public class RollerCoaster extends Vehicle implements IRideable{

   private double tax = .20;
    public RollerCoaster(String name, double tax) {
        super(name, tax);
    }

    @Override
    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public void milesPerHour() {

    }
}
