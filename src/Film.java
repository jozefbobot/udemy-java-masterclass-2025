public class Film {
    private String nazov;

    public Film(String nazov) {
        this.nazov = nazov;
    }

    public void pozerajFilm() {
        String typInstancie = this.getClass().getSimpleName();
        System.out.println(nazov + " je " + typInstancie + " film");
    }

    public static Film getFilm(String typ, String nazov) {
        return switch (typ.toUpperCase().charAt(0)) {
            case 'D' -> new Dobrodruzny(nazov);
            case 'K' -> new Komedia(nazov);
            case 'S' -> new SciFi(nazov);
            default -> new Film(nazov);
        };
    }
}

class Dobrodruzny extends Film {
    public Dobrodruzny(String nazov) {
        super(nazov);
    }

    @Override
    public void pozerajFilm() {
        super.pozerajFilm();
        System.out.printf("..%s%n".repeat(3),
                "Prijemna hudba",
                "Strasidelna hudba",
                "Stane sa nieco zle");
    }
}

class Komedia extends Film {
    public Komedia(String nazov) {
        super(nazov);
    }

    @Override
    public void pozerajFilm() {
        super.pozerajFilm();
        System.out.printf("..%s%n".repeat(3),
                "Stane sa nieco smiesne",
                "Stane sa niečo ešte vtipnejšie",
                "Stastny koniec");
    }
}

class SciFi extends Film {
    public SciFi(String nazov) {
        super(nazov);
    }

    @Override
    public void pozerajFilm() {
        super.pozerajFilm();
        System.out.printf("..%s%n".repeat(3),
                "Zlí mimozemšťania robia zlé veci",
                "Vesmírni chlapci naháňajú mimozemšťanov",
                "Planéta vybuchne");
    }
}