class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop mutant
            System.out.println("This code will never execute.");
        }

        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    }

    public void showBug() {
        method("ok");
    }
}