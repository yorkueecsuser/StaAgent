class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) { // Original assignment
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
        if (a!= null && method1().equals(a)) { // Mutant: Duplicated assignment, added for mutation testing
            System.out.println("Duplicate: Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    }

    public void showBug() {
        method("ok");
    }
}