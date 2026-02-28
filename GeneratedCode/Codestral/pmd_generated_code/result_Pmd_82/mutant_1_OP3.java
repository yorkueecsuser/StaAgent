class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public boolean unreachableCondition() {   // Mutant: Unreachable condition method
        return false;
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) {
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
        if (unreachableCondition()) {   // Mutant: Unreachable if statement
            System.out.println("This code will never be executed.");
        }
    }

    public void showBug() {
        method("ok");
    }
}