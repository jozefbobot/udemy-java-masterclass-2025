public class OsobnyPocitac extends Produkt{
    private Skrina skrina;
    private Monitor monitor;
    private ZakladnaDoska zakladnadoska;

    public OsobnyPocitac(String model, String vyrobca, Skrina skrina, Monitor monitor, ZakladnaDoska zakladnadoska) {
        super(model, vyrobca);
        this.skrina = skrina;
        this.monitor = monitor;
        this.zakladnadoska = zakladnadoska;
    }

    private void nakresliLogo() {
        monitor.nakresliPixel(1200, 50, "žlta");
    }

    public void zapni() {
        skrina.stlacTlacidloZapnutia();
        nakresliLogo();
    }

    /*
    public Skrina getSkrina() {
        return skrina;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public ZakladnaDoska getZakladnadoska() {
        return zakladnadoska;
    }
    */
}