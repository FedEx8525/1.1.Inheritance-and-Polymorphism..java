package s1_t1_L1_ex2;

public class S1_T1_L1_Ex2 {

    public static void main(String[] args) {

        System.out.println("\n--- Start program ---\n");
        System.out.println("--- Ex1.Demonstrate the difference between the different attributes static, \n"
                + " final and static final ---\n");
        System.out.println("The attributes power is final so we can initialize it in the constructor so \n"
                + "we can create a car with default attributes and another with a different power:\n");

        Car carOne = new Car();
        Car carTwo = new Car(220);

        System.out.println(carOne.toString());
        System.out.println(carTwo.toString());

        System.out.println("\nThe attributes model is static so we can change it with the method setModel() \n"
                + "from the Car class but it change the model in every object:\n");
        carTwo.setModel("Mustang");
        System.out.println(carOne.toString());
        System.out.println(carTwo.toString() + "\n");
        carOne.setModel("Puma");
        System.out.println(carOne.toString());
        System.out.println(carTwo.toString() + "\n");

        System.out.println("\nThe attributes brand is static final so we can not change it. It's call CONSTANT \n"
                + "we just can call him with getBrand() method:\n");
        System.out.println("The car brand is " + carOne.getBrand());
        System.out.println("\n--- Ex.1 finish ---\n");

        System.out.println("--- Ex2. Static method Vs. non-static method\n");

        System.out.println("We can call the static method brake() from Car class using the class name Car:\n");
        Car.brake();

        System.out.println("\nWe must call the method accelerate() from Car class using the "
                + "object name carOne and carTwo:\n");
        carOne.accelerate();
        carTwo.accelerate();

        System.out.println("\n--- Ex.2 finish ---\n");
        System.out.println("--- End program ---\n");

    }
}
