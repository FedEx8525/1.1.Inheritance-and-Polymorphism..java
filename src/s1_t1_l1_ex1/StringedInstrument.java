package s1_t1_l1_ex1;

public class StringedInstrument extends Instrument{
    public StringedInstrument(String name, double price) {
        super(name, price);
    }

    public void play(){
        System.out.println("A stringed instrument is playing!");
    }
}
