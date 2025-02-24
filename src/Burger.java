public class Burger extends Polozka {
    private Polozka extra1;
    private Polozka extra2;
    private Polozka extra3;

    public Burger(String nazov, double cena) {
        super("Burger", nazov, cena);
    }

    @Override
    public String getNazov() {
        return super.getNazov() + "BURGER";
    }

    @Override
    public double getUpravenaCena() {
        return getCena() +
                ((extra1 == null) ? 0 : extra1.getUpravenaCena()) +
                ((extra2 == null) ? 0 : extra2.getUpravenaCena()) +
                ((extra3 == null) ? 0 : extra3.getUpravenaCena());
    }

    public double getExtraCenu(String prilohaNazov) {
        return switch (prilohaNazov.toUpperCase()) {
            case "AVOKADO", "SYR" -> 1.0;
            case "SLANINA", "SUNKA", "SALAMA" -> 1.5;
            default -> 0.0;
        };
    }

    public void pridajPrilohu(String extra1, String extra2, String extra3) {
        this.extra1 = new Polozka("PRILOHA", extra1, getExtraCenu(extra1));
        this.extra2 = new Polozka("PRILOHA", extra2, getExtraCenu(extra2));
        this.extra3 = new Polozka("PRILOHA", extra3, getExtraCenu(extra3));
    }

    public void vypisZoznam() {
        vypisPolozky("BEZNY BURGER", getCena());
        if (extra1 != null) extra1.vypisPolozky();
        if (extra2 != null) extra2.vypisPolozky();
        if (extra3 != null) extra3.vypisPolozky();
    }

    @Override
    public void vypisPolozky() {
        vypisZoznam();
        System.out.println("-".repeat(30));
        super.vypisPolozky();
    }
}