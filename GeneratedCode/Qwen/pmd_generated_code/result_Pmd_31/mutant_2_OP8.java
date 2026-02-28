class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
    }

    public String toString() {
        return "IAmSeniorClass";
    }

    public void showBug() {
        new JuniorClass();
    }
}

class JuniorClass extends SeniorClass {
    private String name;
    private String x; // Added variable for mutation

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
        x = "mutated"; // Initializing the added variable
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    // Mutant code with renamed variable
    private String y; // Renamed variable

    public JuniorClass(String y) { // Added constructor for mutation
        super();
        this.y = "mutatedY"; // Initializing the renamed variable
        name = "JuniorClass";
    }

    @Override
    public String toString(String y) { // Added method for mutation
        return y.toUpperCase();
    }
}