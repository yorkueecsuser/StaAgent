class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false
            System.out.println("This is an unreachable if statement in SeniorClass constructor.");
        }
    }

    public String toString() {
        return "IAmSeniorClass";
    }

    public void showBug() {
        new JuniorClass();
    }

    private boolean getCondition() {
        return false;
    }
}

class JuniorClass extends SeniorClass {
    private String name;

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false
            System.out.println("This is an unreachable if statement in JuniorClass constructor.");
        }
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    private boolean getCondition() {
        return false;
    }
}