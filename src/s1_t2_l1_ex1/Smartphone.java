package s1_t2_l1_ex1;

public class Smartphone extends Phone implements Camera, Clock{

    public Smartphone(String brand, String model) {

        super(brand, model);
    }

    public void alarm() {
        System.out.println("The alarm is ringing!");
    }

    public void takePhoto() {
        System.out.println(("Taking a photo!"));
    }
}
