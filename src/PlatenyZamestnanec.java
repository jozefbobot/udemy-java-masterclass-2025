public class PlatenyZamestnanec extends Zamestnanec {
    double rocnyPlat;
    boolean dochodza;

    public PlatenyZamestnanec(String meno, String datumNarodenia, String datumNastupu, double rocnyPlat) {
        super(meno, datumNarodenia, datumNastupu);
        this.rocnyPlat = rocnyPlat;
    }

    @Override
    public double plat() {
        double vyplata = rocnyPlat / 26;
        double upravenaVyplata = (dochodza) ? 0.9 * vyplata : vyplata;
        return (int) upravenaVyplata;
    }

    public void dochodok() {
        koniec("12/12/2025");
        dochodza = true;
    }
}