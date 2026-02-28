class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) {
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }

        // Mutated code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is always executed.");
        }
    }

    public void showBug() {
        method("ok");
    }
}