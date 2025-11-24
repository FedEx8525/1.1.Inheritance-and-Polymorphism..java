package s1_t1_l1_ex1;

public class WindInstrument extends Instrument{

    public WindInstrument(String name, double price){
        super(name, price);
    }

    public void play() {
        System.out.println("A wind instrument is playing!");
    }
}
