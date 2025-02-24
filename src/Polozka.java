public class Polozka {
    private String typ;
    private String nazov;
    private double cena;
    private String velkost = "MEDIUM";

    public Polozka(String typ, String nazov, double cena) {
        this.typ = typ.toUpperCase();
        this.nazov = nazov.toUpperCase();
        this.cena = cena;
    }

    public String getNazov() {
        if (typ.equals("PRILOHA") || typ.equals("NAPOJ")) return velkost + " " + nazov;
        return nazov;
    }

    public double getCena() {
        return cena;
    }

    public double getUpravenaCena() {
        return switch (velkost) {
            case "MALY" -> getCena() - 0.5;
            case "VELKY" -> getCena() + 1;
            default -> getCena();
        };
    }

    public void setVelkost(String velkost) {
        this.velkost = velkost;
    }

    public static void vypisPolozky(String nazov, double cena) {
        System.out.printf("%20s:%6.2f%n", nazov, cena);
    }

    public void vypisPolozky() {
        vypisPolozky(getNazov(), getUpravenaCena());
    }
}
