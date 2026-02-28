class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        boolean unreachableCondition = false; // Mutated code: added unreachable condition
        if (a!= null) {
            for (int i = 0; unreachableCondition; i++) { // Mutated code: added unreachable for loop
                System.out.println("This loop is unreachable.");
            }
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    }

    public void showBug() {
        method("ok");
    }

    private boolean getCondition() {
        return false; // This method always returns false to ensure the loop is unreachable
    }
}