public class AutoUloha {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public AutoUloha(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends AutoUloha {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }
}

class Holden extends AutoUloha {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }
}

class Ford extends AutoUloha {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }
}