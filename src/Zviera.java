public class Zviera {
    protected String typ;
    private String velkost;
    private double vaha;

    public Zviera(String typ, String velkost, double vaha) {
        this.typ = typ;
        this.velkost = velkost;
        this.vaha = vaha;
    }

    public Zviera() {
    }

    @Override
    public String toString() {
        return "Zviera{" +
                "typ='" + typ + '\'' +
                ", velkosť='" + velkost + '\'' +
                ", váha=" + vaha +
                '}';
    }

    public void pohyb(String rychlost) {
        System.out.println(typ + " sa pohybuje " + rychlost);
    }

    public void vydajZvuk() {
        System.out.println(typ + " vydáva nejaký zvuk");
    }
}