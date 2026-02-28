class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                System.out.println("This is unreachable");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is dynamically determined
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
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                System.out.println("This is also unreachable");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is dynamically determined
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}