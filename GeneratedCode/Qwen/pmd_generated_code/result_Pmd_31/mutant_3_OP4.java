class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that might run
        } else {
            // Unreachable code due to shouldRun always being false at runtime
        }
    }

    public String toString() {
        return "IAmSeniorClass";
    }

    public void showBug() {
        new JuniorClass();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is not a compile-time constant
    }
}

class JuniorClass extends SeniorClass {
    private String name;

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that might run
        } else {
            // Unreachable code due to shouldRun always being false at runtime
        }
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is not a compile-time constant
    }
}