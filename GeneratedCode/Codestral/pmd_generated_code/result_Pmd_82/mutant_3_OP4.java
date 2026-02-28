class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public boolean getCondition() {
        return false;
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        } else if (getCondition()) { // Unreachable if-else statement mutation
            System.out.println("This branch is unreachable.");
        }
    }

    public void showBug() {
        method("ok");
    }
}