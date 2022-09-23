public class Engine extends Vehicle{
   private int cylinders;

    public Engine(String name, double tax, int cylinders) {
        super(name, tax);
        this.cylinders = cylinders;

    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }


}



