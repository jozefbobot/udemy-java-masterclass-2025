public class Hrac {
    public String meno;
    public int zdravie;
    public String zbran;

    public void strataZdravie(int demage) {
        this.zdravie -= demage;
        if (this.zdravie <= 0) {
            System.out.println("Koniec hry");
        }
    }

    public int ostavajuceZdravie() {
        return this.zdravie;
    }

    public void zvysenieZdravia(int extraZdravie) {
        this.zdravie += extraZdravie;
        if (this.zdravie > 100) {
            System.out.println("Zdravie je plne");
            this.zdravie = 100;
        }
    }
}