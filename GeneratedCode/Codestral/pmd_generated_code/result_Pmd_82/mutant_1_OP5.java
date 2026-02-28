class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        boolean condition = getCondition();
        if (a!= null && method1().equals(a)) {
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
        // Mutant: Unreachable switch statement
        switch (condition) {
            case true:
                System.out.println("This line should never be reached");
                break;
        }
    }

    public void showBug() {
        method("ok");
    }

    private boolean getCondition() {
        return false;
    }
}