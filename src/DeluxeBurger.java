public class DeluxeBurger extends Burger {
    Polozka deluxe1;
    Polozka deluxe2;

    public DeluxeBurger(String nazov, double cena) {
        super(nazov, cena);
    }

    public void pridajPrilohu(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.pridajPrilohu(extra1, extra2, extra3);
        deluxe1 = new Polozka("PRILOHA", extra4, 0);
        deluxe2 = new Polozka("PRILOHA", extra5, 0);
    }

    @Override
    public void vypisZoznam() {
        super.vypisZoznam();
        if (deluxe1 != null) deluxe1.vypisPolozky();
        if (deluxe2 != null) deluxe2.vypisPolozky();
    }

    @Override
    public double getExtraCenu(String prilohaNazov) {
        return 0;
    }
}