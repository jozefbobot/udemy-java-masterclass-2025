public class Zamestnanec extends Pracovnik {
    private long idZamestnanca;
    private String datumNastupu;

    private static int cisloPracovnika = 1;

    public Zamestnanec(String meno, String datumNarodenia, String datumNastupu) {
        super(meno, datumNarodenia);
        this.idZamestnanca = Zamestnanec.cisloPracovnika++;
        this.datumNastupu = datumNastupu;
    }

    @Override
    public String toString() {
        return "Zamestnanec{" +
                "idZamestnanca=" + idZamestnanca +
                ", datumNastupu='" + datumNastupu + '\'' +
                "} " + super.toString();
    }
}