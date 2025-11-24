package s1_t1_l1_ex1;

public abstract class Instrument {

    private String name;
    private double price;

    static {
        System.out.println("This is a Static Block! The Instrument Class has been loaded into the JVM!\n");
    }


    private static final String MUSIC_STYLE = "Rock";


    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

    public static String getMusicStyle() {
        return MUSIC_STYLE;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public abstract void play();


    public String toString() {
        return "The instrument is a " + this.getName() + " and it cost " + this.getPrice() + " €.";
    }
}
