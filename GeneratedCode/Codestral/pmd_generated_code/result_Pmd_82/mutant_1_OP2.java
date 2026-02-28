class BuggyCode {
    public String method1() {
        String result = "ok";
        return result;
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            String result = "ok"; // Duplicate the assignment statement from method1()
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    }

    public void showBug() {
        method("ok");
    }
}