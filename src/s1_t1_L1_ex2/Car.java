package s1_t1_L1_ex2;

public class Car {

    private final static String BRAND = "Ford";
    private static String model = "Focus";
    private final int power;


    public Car() {
        this.power = 150;
    }

    public Car(int newPower) {
        this.power = newPower;
    }

    public String getBrand() {
        return this.BRAND;
    }
    public String getModel() {
        return this.model;
    }
    public int getPower() {
        return this.power;
    }

    public void setModel(String model) {
        Car.model = model;
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }

    public static void brake() {
        System.out.println("The car is braking");
    }

    public String toString() {
        String var10000 = this.getBrand();
        return "The " + var10000 + " " + this.getModel() + " have " + this.getPower() + "CV.";
    }
}
