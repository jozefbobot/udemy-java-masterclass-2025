public class Auto {
    private String popis;

    public Auto(String popis) {
        this.popis = popis;
    }

    public void nastartovatMotor() {
        System.out.println("Auto -> nastartuj motor");
    }

    protected void spustiMotor() {
        System.out.println("Auto -> spusti motor");
    }

    public void riadit() {
        System.out.println("Auto -> ide, typ je " + getClass().getSimpleName());
        spustiMotor();
    }
}

class BenzinoveAuto extends Auto {
    private double priemerKmNaLiter;
    private int valce = 6;

    public BenzinoveAuto(String popis) {
        super(popis);
    }

    public BenzinoveAuto(String popis, double priemerKmNaLiter, int valce) {
        super(popis);
        this.priemerKmNaLiter = priemerKmNaLiter;
        this.valce = valce;
    }

    @Override
    public void nastartovatMotor() {
        System.out.printf("Benzinove -> všetky %d valce su zaplnené. Pripraveny!%n", valce);
    }

    @Override
    protected void spustiMotor() {
        System.out.printf("Benzinove -> využitie presahuje priemer: %.2f %n", priemerKmNaLiter);
    }
}

class ElektrickeAuto extends Auto {
    private double priemerKmNaNabitie;
    private int velkostBaterie;

    public ElektrickeAuto(String popis) {
        super(popis);
    }

    public ElektrickeAuto(String popis, double priemerKmNaNabitie, int velkostBaterie) {
        super(popis);
        this.priemerKmNaNabitie = priemerKmNaNabitie;
        this.velkostBaterie = velkostBaterie;
    }

    @Override
    public void nastartovatMotor() {
        System.out.printf("Elektricke -> zapnite %d kWh bateriu, Pripraveny!%n", velkostBaterie);
    }

    @Override
    protected void spustiMotor() {
        System.out.printf("Elektricke -> použitie pod priemerom: %.2f %n", priemerKmNaNabitie);
    }
}

class HybridneAuto extends Auto {
    private double priemerKmNaLiter;
    private int valce = 6;
    private int velkostBaterie;

    public HybridneAuto(String popis) {
        super(popis);
    }

    public HybridneAuto(String popis, double priemerKmNaLiter, int valce, int velkostBaterie) {
        super(popis);
        this.priemerKmNaLiter = priemerKmNaLiter;
        this.valce = valce;
        this.velkostBaterie = velkostBaterie;
    }

    @Override
    public void nastartovatMotor() {
        System.out.printf("Benzinove -> všetky %d valce su zaplnené. Pripraveny!%n", valce);
        System.out.printf("Elektricke -> zapnite %d kWh bateriu, Pripraveny!%n", velkostBaterie);
    }

    @Override
    protected void spustiMotor() {
        System.out.printf("Hybridne -> použitie pod priemerom: %.2f %n", priemerKmNaLiter);
    }
}