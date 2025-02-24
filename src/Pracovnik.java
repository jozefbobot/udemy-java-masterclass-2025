public class Pracovnik {
    private String meno;
    private String datumNarodenia;
    protected String datumKoncaZmluvy;

    public Pracovnik() {

    }

    public Pracovnik(String meno, String datumNarodenia) {
        this.meno = meno;
        this.datumNarodenia = datumNarodenia;
    }

    public int vratVek() {
        int aktualnyRok = 2025;
        int rokNarodenia = Integer.parseInt(datumNarodenia.substring(6));

        return (aktualnyRok - rokNarodenia);
    }

    public double plat() {
        return 0.0;
    }

    public void koniec(String datumKoncaZmluvy) {
        this.datumKoncaZmluvy = datumKoncaZmluvy;
    }

    @Override
    public String toString() {
        return "Pracovnik{" +
                "meno='" + meno + '\'' +
                ", datumNarodenia='" + datumNarodenia + '\'' +
                ", datumKoncaZmluvy='" + datumKoncaZmluvy + '\'' +
                '}';
    }
}