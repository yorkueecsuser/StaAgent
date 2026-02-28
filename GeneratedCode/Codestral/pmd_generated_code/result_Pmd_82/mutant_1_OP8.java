class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    }

    public void showBug() {
        String str = "ok"; // Mutation: Renamed variable 'a' to'str'
        method(str);
    }

    // Added a new method to check the renamed variable
    public void checkStr(String str) {
        if (str!= null && method1().equals(str)) {
            System.out.println("Checking the renamed variable:'str'");
        }
    }
}