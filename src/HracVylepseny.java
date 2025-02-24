public class HracVylepseny {
    private String celeMeno;
    private int zdraviePercento;
    private String zbran;

    public HracVylepseny(String celeMeno) {
        this(celeMeno, 100, "Meč");
    }

    public HracVylepseny(String celeMeno, int zdravie, String zbran) {
        this.celeMeno = celeMeno;
        if (zdravie <= 0) {
            this.zdraviePercento = 1;
        } else if (zdravie > 100) {
            this.zdraviePercento = 100;
        } else {
            this.zdraviePercento = zdravie;
        }
        this.zbran = zbran;
    }

    public void strataZdravie(int demage) {
        this.zdraviePercento -= demage;
        if (this.zdraviePercento <= 0) {
            System.out.println("Koniec hry");
        }
    }

    public int ostavajuceZdravie() {
        return this.zdraviePercento;
    }

    public void zvysenieZdravia(int extraZdravie) {
        this.zdraviePercento += extraZdravie;
        if (this.zdraviePercento > 100) {
            System.out.println("Zdravie je plne");
            this.zdraviePercento = 100;
        }
    }
}