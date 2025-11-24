package s1_t2_l1_ex1;

public class S1_T2_L1_Ex1 {

    public static void main(String[] args) {
        System.out.println("\n--- Start program ---\n");

        System.out.println("Creating two object Smartphone:\n");
        Smartphone newPhone1 = new Smartphone("Samsung", "Galaxy S21");
        Smartphone newPhone2 = new Smartphone("Poco", "F7");

        System.out.println("\nWe can call the toString method from de Phone class: ");
        System.out.println(newPhone1.toString());

        System.out.println("\nWe can call the method .call() from Phone class:  ");
        newPhone1.call("637529940");
        newPhone2.call("657739874");

        System.out.println("\nWe can call the method .takePhoto() from the interface Camera: ");
        newPhone1.takePhoto();
        newPhone2.takePhoto();

        System.out.println("\nWe can call the method .alarm() from the interface Clock: ");
        newPhone1.alarm();
        newPhone2.alarm();

        System.out.println("\n--- End program ---\n");
    }
}
