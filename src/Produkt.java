public class Produkt {
    private String model;
    private String vyrobca;
    private int sirka;
    private int vyska;
    private int hlbka;

    public Produkt(String model, String vyrobca) {
        this.model = model;
        this.vyrobca = vyrobca;
    }
}

class Monitor extends Produkt {
    private int velkost;
    private String rezlisenie;

    public Monitor(String model, String vyrobca) {
        super(model, vyrobca);
    }

    public Monitor(String model, String vyrobca, int velkost, String rezlisenie) {
        super(model, vyrobca);
        this.velkost = velkost;
        this.rezlisenie = rezlisenie;
    }

    public void nakresliPixel(int x, int y, String farba) {
        System.out.println(String.format("Vykreslujem pixel na %d, %d vo farbe %s", x, y, farba));
    }
}

class ZakladnaDoska extends Produkt {
    private int ram;
    private int pci;
    private String bios;

    public ZakladnaDoska(String model, String vyrobca) {
        super(model, vyrobca);
    }

    public ZakladnaDoska(String model, String vyrobca, int ram, int pci, String bios) {
        super(model, vyrobca);
        this.ram = ram;
        this.pci = pci;
        this.bios = bios;
    }

    public void nacitajProgram(String nazovProgramu) {
        System.out.println("Nacitava program: " + nazovProgramu);
    }
}

class Skrina extends Produkt {
    private String zdroj;

    public Skrina(String model, String vyrobca) {
        super(model, vyrobca);
    }

    public Skrina(String model, String vyrobca, String zdroj) {
        super(model, vyrobca);
        this.zdroj = zdroj;
    }

    public void stlacTlacidloZapnutia() {
        System.out.println("Tlacidlo zapnute");
    }
}