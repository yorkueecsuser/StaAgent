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
    private String z; // New variable introduced for mutation

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
        z = "mutatedVariable"; // Initialization of the new variable
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}