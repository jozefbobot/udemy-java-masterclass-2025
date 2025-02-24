public class InteligentnaKuchyna {
    private Kavovar kavovar;
    private Chladnicka chladnicka;
    private Umyvacka umyvacka;

    public InteligentnaKuchyna() {
        kavovar = new Kavovar();
        chladnicka = new Chladnicka();
        umyvacka = new Umyvacka();
    }

    public Kavovar getKavovar() {
        return kavovar;
    }

    public Chladnicka getChladnicka() {
        return chladnicka;
    }

    public Umyvacka getUmyvacka() {
        return umyvacka;
    }

    public void nastavKuchynu(boolean kavovarStav, boolean chladnickaStav, boolean umyvackaStav) {
        kavovar.setMaCoRobit(kavovarStav);
        chladnicka.setMaCoRobit(chladnickaStav);
        umyvacka.setMaCoRobit(umyvackaStav);
    }

    public void robKuchynskePrace() {
        kavovar.uvarKavu();
        chladnicka.objednatJedlo();
        umyvacka.umyvatRiad();
    }
}

class Kavovar {
    private boolean maCoRobit;

    public void setMaCoRobit(boolean maCoRobit) {
        this.maCoRobit = maCoRobit;
    }

    public void uvarKavu() {
        if (maCoRobit) {
            System.out.println("Varim kavu");
            maCoRobit = false;
        }
    }
}

class Chladnicka {
    private boolean maCoRobit;

    public void setMaCoRobit(boolean maCoRobit) {
        this.maCoRobit = maCoRobit;
    }

    public void objednatJedlo() {
        if (maCoRobit) {
            System.out.println("Objednavam jedlo");
            maCoRobit = false;
        }
    }
}

class Umyvacka {
    private boolean maCoRobit;

    public void setMaCoRobit(boolean maCoRobit) {
        this.maCoRobit = maCoRobit;
    }

    public void umyvatRiad() {
        if (maCoRobit) {
            System.out.println("Umyvam riad");
            maCoRobit = false;
        }
    }
}