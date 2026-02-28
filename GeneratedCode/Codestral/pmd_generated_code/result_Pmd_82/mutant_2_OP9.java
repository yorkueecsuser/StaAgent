class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        if (a!= null && a.equals(method1())) { // Mutant: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but a.equals(method1()) is used.");
        }
    }

    public void showBug() {
        method("ok");
    }
}