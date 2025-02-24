public class HodinovyZamestnanec extends Zamestnanec {
    private double hodinovaMzda;

    public HodinovyZamestnanec(String meno, String datumNarodenia, String datumNastupu, double hodinovaMzda) {
        super(meno, datumNarodenia, datumNastupu);
        this.hodinovaMzda = hodinovaMzda;
    }

    @Override
    public double plat() {
        return 40 * hodinovaMzda;
    }

    public double dvojityPlat() {
        return 2 * plat();
    }
}