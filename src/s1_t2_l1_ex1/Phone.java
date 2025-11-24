package s1_t2_l1_ex1;

public abstract class Phone {

    private String brand;
    private String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public  void setModel(String model) {
        this.model = model;
    }

    public void call(String phoneNumber) {
        System.out.println("Calling number " + phoneNumber);
    }

    public String toString() {
        return "This phone is a " + this.getBrand() + " "
                + this.getModel() + ".";
    }
}
