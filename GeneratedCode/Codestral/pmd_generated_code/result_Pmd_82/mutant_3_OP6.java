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
        if (a!= null && method1().equals(a)) {
            // Mutant code start
            for (int i = 0; getCondition(); i++) {
                System.out.println("This loop is unreachable");
            }
            // Mutant code end
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    }

    public void showBug() {
        method("ok");
    }
}