public class Customer {
    private String name;
    private double creditLimit;
    private String mail;

    public Customer(String name, double creditLimit, String mail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.mail = mail;
    }

    public Customer() {
        this("Palo", 1000.0, "palo@gmail.com");
    }

    public Customer(String name, String mail) {
        this(name, 10000.0, mail);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getMail() {
        return mail;
    }
}