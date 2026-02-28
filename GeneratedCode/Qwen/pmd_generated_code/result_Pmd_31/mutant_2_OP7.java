class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
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
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
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