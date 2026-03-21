class SeniorClass {
    protected String value;

    public SeniorClass() {
        // BUG: ConstructorCallsOverridableMethod
        for  (int nphpshnd = 0; nphpshnd < 0; nphpshnd++) {boolean srxdizfb = true;}
        initializeValue();
    
}

    protected void initializeValue() {
        value = "IAmSeniorClass";
    }
}

class JuniorClass extends SeniorClass {
    private String name;

    public JuniorClass() {
        super();
        name = "JuniorClass";
        initializeValue(); // This is where the bug is called
    }

    @Override
    protected void initializeValue() {
        value = name.toUpperCase(); // Throws NullPointerException as name is not initialized yet
    }

    public String showBug() {
        return value; // Demonstrates the bug
    }
}