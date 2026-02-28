class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        String x = a; // Mutated: Renaming variable 'a' to 'x'
        if (x!= null && method1().equals(x)) { // Updated to use the new variable 'x'
            System.out.println("Incorrect usage, x is not null but method1().equals(x) is used.");
        }
    }

    public void showBug() {
        method("ok");
    }
}