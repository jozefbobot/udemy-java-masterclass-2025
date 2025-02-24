public class Objednavka {
    private Burger burger;
    private Polozka napoj;
    private Polozka priloha;

    public Objednavka() {
        this("bezny", "kola", "hranolky");
    }

    public Objednavka (String burgerTyp, String napojTyp, String prilohaTyp) {
        if (burgerTyp.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerTyp, 8.5);
        } else {
            this.burger = new Burger(burgerTyp, 4.0);
        }
        this.napoj = new Polozka("NAPOJ", napojTyp, 1.0);
        this.priloha = new Polozka("PRILOHA", prilohaTyp, 1.5);
    }

    public double celkovaSuma() {
        if (burger instanceof DeluxeBurger) {
            return burger.getUpravenaCena();
        }
        return priloha.getUpravenaCena() + napoj.getUpravenaCena() + burger.getUpravenaCena();
    }

    public void vypisPolozky() {
        burger.vypisPolozky();
        if (burger instanceof DeluxeBurger) {
            Polozka.vypisPolozky(napoj.getNazov(), 0);
            Polozka.vypisPolozky(priloha.getNazov(), 0);
        } else {
            napoj.vypisPolozky();
            priloha.vypisPolozky();
        }
        System.out.println("-".repeat(30));
        Polozka.vypisPolozky("CELKOVA CENA", celkovaSuma());
    }

    public void pridajPrilohuBurgru(String extra1, String extra2, String extra3) {
        burger.pridajPrilohu(extra1, extra2, extra3);
    }

    public void pridajPrilohuBurgru(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof  DeluxeBurger db) {
            db.pridajPrilohu(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.pridajPrilohu(extra1, extra2, extra3);
        }
    }

    public void nastavVelkostNapoja(String velkost) {
        napoj.setVelkost(velkost);
    }
}
