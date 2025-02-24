public class TlaciarenUloha {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public TlaciarenUloha(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1;
        }
        if (this.tonerLevel + tonerAmount > 100) {
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2);
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}