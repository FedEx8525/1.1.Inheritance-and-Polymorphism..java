package s1_t1_l1_ex1;

public class S1_T1_L1_Ex1 {
    public static void main(String[] args) {
        System.out.println("\n--- Start program ---\n"
                + "\nClass Instrument not loaded!\n");



        System.out.println("--- EX1. Call static attribute ---\n"
                + "\nLoad Instrument Class calling the static attribute:\n");
        System.out.println("The band is playing " + Instrument.getMusicStyle() +"!\n"
                + "\nClass Instrument loaded!\n");
        System.out.println("--- End Ex1 ---\n");



        System.out.println("--- Ex2. Call static method ---\n"
                + "\nInstantiate objects and calling the static method:\n"
                + "\nClass Instrument already loaded!\n"
                + "Don't print the static method!\n");

        Instrument saxophone = new WindInstrument("Saxophone", 750.00);
        Instrument bass = new StringedInstrument("Bass", 850.00);
        Instrument drum = new PercussionInstrument("Drum", 950.00);

        saxophone.play();
        bass.play();
        drum.play();

        System.out.println("\n--- End Ex2 ---\n"
                + "\n--- End program ---");

    }
}
