public class Car {
    private String make = "Bughati";
    private String model = "Revuelto";
    private String color = "Blue";
    private int doors = 2;
    private boolean convertible = false;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if (make == null) make = "nezname";
        String lowerCase = make.toLowerCase();
        switch (lowerCase) {
            case "bugatti", "ferrari", "porsche" -> this.make = make;
            default -> {
                this.make = "Nepodporované";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Doors" +
                        color + " " +
                        make + " " +
                        model + " " +
                        (convertible ? "Convertible" : ""));
    }

}