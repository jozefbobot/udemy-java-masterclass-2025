public class Ryba extends Zviera {
    private int ziabre;
    private int plutvy;

    public Ryba(String typ, double vaha, int ziabre, int plutvy) {
        super(typ, "malá", vaha);
        this.ziabre = ziabre;
        this.plutvy = plutvy;
    }

    private void pohniSvalmi() {
        System.out.print("svaly sa pohybujú ");
    }

    private void pohniPlutvou() {
        System.out.print("plutva sa pohybuje");
    }

    @Override
    public void pohyb(String rychlost) {
        super.pohyb(rychlost);
        pohniSvalmi();
        if (rychlost.equals("rýchlo")) {
            pohniPlutvou();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Ryba{" +
                "žiabre=" + ziabre +
                ", plutvy=" + plutvy +
                "} " + super.toString();
    }
}