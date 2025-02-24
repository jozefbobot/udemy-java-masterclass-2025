public class Tlaciaren {
    private int urovenToneru;
    private int pocetVytlacenychStran;
    private boolean obojstranneTlacenie;

    public Tlaciaren(int urovenToneru, boolean obojstranneTlacenie) {
        this.pocetVytlacenychStran = 0;
        this.urovenToneru = (urovenToneru >= 0 && urovenToneru <= 100) ? urovenToneru : -1;
        this.obojstranneTlacenie = obojstranneTlacenie;
    }

    public int pridajToner(int mnozstvoTonera) {
        int tempMnozstvo = this.urovenToneru + mnozstvoTonera;
        if (tempMnozstvo > 100 || tempMnozstvo < 0) {
            return -1;
        }
        this.urovenToneru += mnozstvoTonera;
        return mnozstvoTonera;
    }

    public int tlacStranok(int pocetStran) {
        int strany = (obojstranneTlacenie) ? (pocetStran / 2) + (pocetStran % 2) : pocetStran;
        this.pocetVytlacenychStran += strany;
        return strany;
    }

    public int getPocetVytlacenychStran() {
        return pocetVytlacenychStran;
    }
}