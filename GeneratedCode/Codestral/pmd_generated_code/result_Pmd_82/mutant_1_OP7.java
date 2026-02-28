class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");

            // Mutant: inserting unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("This is an unreachable loop.");
            }
        }
    }

    public void showBug() {
        method("ok");
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }
}