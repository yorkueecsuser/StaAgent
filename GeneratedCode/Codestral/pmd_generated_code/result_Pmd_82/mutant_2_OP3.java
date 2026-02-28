class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    private boolean getFalseCondition() {
        return false; // This method will always return false
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) { // Original condition
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
        if (getFalseCondition()) { // Unreachable if branch
            System.out.println("This line of code is unreachable.");
        }
    }

    public void showBug() {
        method("ok");
    }
}