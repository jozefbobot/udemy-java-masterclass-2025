public class Ucet {
    private int cisloUctu;
    private double zostatok;
    private String meno;
    private String mail;
    private String cislo;

    public Ucet() {
        this(0, 100.0, "Default", "Default", "Default");
        System.out.println("Pradzny konštruktor");
    }

    public Ucet(int cisloUctu, double zostatok, String meno, String mail, String cislo) {
        System.out.println("Konštruktor s parametrami");
        this.cisloUctu = cisloUctu;
        this.zostatok = zostatok;
        this.meno = meno;
        this.mail = mail;
        this.cislo = cislo;
    }

    public Ucet(String meno, String mail, String cislo) {
        this(9999, 10.0, meno, mail, cislo);
        //this.meno = meno;
        //this.mail = mail;
        // this.cislo = cislo;
    }

    public int getCisloUctu() {
        return cisloUctu;
    }

    public double getZostatok() {
        return zostatok;
    }

    public String getMeno() {
        return meno;
    }

    public String getMail() {
        return mail;
    }

    public String getCislo() {
        return cislo;
    }

    public void setCisloUctu(int cisloUctu) {
        this.cisloUctu = cisloUctu;
    }

    public void setZostatok(double zostatok) {
        this.zostatok = zostatok;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCislo(String cislo) {
        this.cislo = cislo;
    }

    public void vklad(double sumaVkladu) {
        if (sumaVkladu > 0) {
            this.zostatok += sumaVkladu;
            System.out.println("Vklad bol uspešný. \nTvoj aktualny zostatok je: " + this.zostatok);
        } else {
            System.out.println("Vklad zamietnutý.");
        }
    }

    public void vyber(double sumaVyberu) {
        if (sumaVyberu > 0){
            if ((this.zostatok - sumaVyberu) < 0) {
                System.out.println("Vyber zamietnutý. Nedostatok penazi na účte");
            } else {
                this.zostatok -= sumaVyberu;
                System.out.println("Vyber bol vykonany. \nTvoj aktualny zostatok je: " + this.zostatok);
            }
        } else {
            System.out.println("Vyber nepovoleny.");
        }
    }

}