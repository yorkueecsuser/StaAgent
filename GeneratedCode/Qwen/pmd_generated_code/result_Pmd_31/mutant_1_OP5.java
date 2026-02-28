class SeniorClass {
    public SeniorClass() {
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod

        // Introduced an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case");
                break;
            default:
                // This is the reachable default case
                System.out.println("This is the default case");
                break;
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

        // Introduced an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in JuniorClass");
                break;
            default:
                // This is the reachable default case
                System.out.println("This is the default case in JuniorClass");
                break;
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