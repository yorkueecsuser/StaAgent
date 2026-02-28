class SeniorClass {
    public SeniorClass() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop will never execute because getCondition() returns false
        }
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
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
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop will never execute because getCondition() returns false
        }
        name = "JuniorClass";
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}