public class Pes extends Zviera {
    private String tvarUcha;
    private String tvarChvosta;

    public Pes() {
        super("Miešanec", "Veľký", 50);
    }

    public Pes(String typ, double vaha) {
        this(typ, vaha, "Vystreté", "Zahnutý");
    }

    public Pes(String typ, double vaha, String tvarUcha, String tvarChvosta) {
        super(typ, vaha < 15 ? "malý" : (vaha < 35 ? "stredný" : "veľký"), vaha);
        this.tvarUcha = tvarUcha;
        this.tvarChvosta = tvarChvosta;
    }

    @Override
    public String toString() {
        return "Pes{" +
                "tvarUcha='" + tvarUcha + '\'' +
                ", tvarChvosta='" + tvarChvosta + '\'' +
                "} " + super.toString();
    }

    @Override
    public void vydajZvuk() {
        if (typ.equals("Vlk")) {
            System.out.print("Au Uuuu! ");
        }

        stekaj();
        System.out.println();
    }

    @Override
    public void pohyb(String rychlost) {
        super.pohyb(rychlost);
        if (rychlost.equals("pomaly")) {
            kracaj();
            vrtChvostom();
        } else {
            bez();
            stekaj();
        }
        System.out.println();
    }

    private void stekaj() {
        System.out.print("Hav!");
    }

    private void bez() {
        System.out.print("Pes beží");
    }

    private void kracaj() {
        System.out.print("Pes kráča");
    }

    private void vrtChvostom() {
        System.out.print("Vrtí chvostom");
    }
}