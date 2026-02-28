class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        String abcdefgh = "unusedVariable"; // Dead Store Mutation
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

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
        int ijklmnop = 42; // Dead Store Mutation
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}