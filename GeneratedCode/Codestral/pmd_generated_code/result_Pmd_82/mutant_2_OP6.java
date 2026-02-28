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
            // Mutant: Inserting unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This loop is unreachable.");
            }
        }
    }

    public boolean getCondition() {
        // This method always returns false to ensure the loop is unreachable
        return false;
    }

    public void showBug() {
        method("ok");
    }
}