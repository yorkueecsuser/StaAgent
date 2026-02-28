class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        boolean shouldRun = getCondition(); // Added to introduce an unreachable if-else statement
        if (shouldRun) {
            System.out.println("This is reachable");
        } else {
            System.out.println("This is unreachable");
        }
    }

    public String toString() {
        return "IAmSeniorClass";
    }

    public void showBug() {
        new JuniorClass();
    }

    private boolean getCondition() {
        return true; // This ensures the if block is reachable, making the else block unreachable
    }
}

class JuniorClass extends SeniorClass {
    private String name;

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
        boolean shouldRun = getCondition(); // Added to introduce an unreachable if-else statement
        if (shouldRun) {
            System.out.println("This is reachable");
        } else {
            System.out.println("This is unreachable");
        }
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    private boolean getCondition() {
        return true; // This ensures the if block is reachable, making the else block unreachable
    }
}