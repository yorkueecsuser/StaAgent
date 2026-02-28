class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String b) {
        if (b!= null && method1().equals(b)) { // Mutated: 'a' renamed to 'b'
            System.out.println("Incorrect usage, b is not null but method1().equals(b) is used.");
        }
    }

    public void showBug() {
        method("ok");
    }
}