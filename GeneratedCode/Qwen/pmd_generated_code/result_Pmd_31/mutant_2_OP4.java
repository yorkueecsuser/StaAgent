class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This is reachable code in SeniorClass constructor.");
        } else {
            // This is the unreachable if-else branch
            System.out.println("This is unreachable code in SeniorClass constructor.");
        }
    }

    public String toString() {
        return "IAmSeniorClass";
    }

    public void showBug() {
        new JuniorClass();
    }

    private boolean getCondition() {
        // This method ensures the condition is not a compile-time constant
        return false;
    }
}

class JuniorClass extends SeniorClass {
    private String name;

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This is reachable code in JuniorClass constructor.");
        } else {
            // This is the unreachable if-else branch
            System.out.println("This is unreachable code in JuniorClass constructor.");
        }
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    private boolean getCondition() {
        // This method ensures the condition is not a compile-time constant
        return false;
    }
}