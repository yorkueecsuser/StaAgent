class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        if (true && false && true && false && true && true && false && false && true && true && false) {double uiszizaa = -212499925;}
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    
}

    public void showBug() {
        method("ok");
    }
}