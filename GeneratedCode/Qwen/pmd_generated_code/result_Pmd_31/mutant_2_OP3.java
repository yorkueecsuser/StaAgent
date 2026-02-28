class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        boolean condition = getCondition(); // Added condition to insert unreachable if statement
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable statement in SeniorClass constructor.");
        }
    }

    public String toString() {
        return "IAmSeniorClass";
    }

    public void showBug() {
        new JuniorClass();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}

class JuniorClass extends SeniorClass {
    private String name;

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
        boolean condition = getCondition(); // Added condition to insert unreachable if statement
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable statement in JuniorClass constructor.");
        }
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}