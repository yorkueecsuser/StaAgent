class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() will return false
        }
    }

    private boolean getCondition() {
        return false;
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() will return false
        }
    }

    private boolean getCondition() {
        return false;
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}