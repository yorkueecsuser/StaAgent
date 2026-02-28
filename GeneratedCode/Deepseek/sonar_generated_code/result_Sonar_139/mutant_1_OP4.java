class BugDemo {

    public String getStringCondition() {
        return "true";
    }

    public String getStringValue() {
        return "0";
    }

    // BUG: "Double.longBitsToDouble" should take "long" as argument
    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }

    public double showBugCompliant() {
        long i = 0x80003800L;
        return Double.longBitsToDouble(i);   // Compliant - 1.0610049784E-314
    }

    public void unreachableIfElse() {
        boolean condition = Boolean.parseBoolean(getStringCondition());
        if (condition) {
            System.out.println("This branch is reachable");
        } else {
            System.out.println("This branch is unreachable and should be mutated");
        }
    }

    public void unreachableWhileLoop() {
        boolean conditionWhile = Boolean.parseBoolean(getStringCondition());
        while (conditionWhile) {
            System.out.println("This branch is reachable");
            conditionWhile = false;
        }
    }

    public void unreachableForLoop() {
        boolean conditionFor = Boolean.parseBoolean(getStringCondition());
        for (int i = 0; conditionFor; i++) {
            System.out.println("This branch is reachable");
            conditionFor = false;
        }
    }

    public void unreachableSwitchStatement() {
        int value = Integer.parseInt(getStringValue());
        switch(value) {
            case 1:
                System.out.println("This branch is reachable");
                break;
            default:
                System.out.println("This branch is unreachable and should be mutated");
                break;
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println("Noncompliant: " + demo.showBug());
        System.out.println("Compliant: " + demo.showBugCompliant());

        demo.unreachableIfElse();
        demo.unreachableWhileLoop();
        demo.unreachableForLoop();
        demo.unreachableSwitchStatement();
    }
}