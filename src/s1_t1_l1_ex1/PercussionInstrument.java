package s1_t1_l1_ex1;

public class PercussionInstrument extends Instrument{
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A percussion instrument is playing!");
    }

}
