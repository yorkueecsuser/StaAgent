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
        }

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code branch
            System.out.println("This code branch is unreachable.");
        } else {
            // Alternative code branch
            System.out.println("This code branch is executed instead.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        method("ok");
    }
}