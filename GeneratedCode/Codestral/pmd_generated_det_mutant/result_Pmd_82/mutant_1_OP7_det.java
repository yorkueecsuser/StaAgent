class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        boolean jwfvgufq = false;while (jwfvgufq && false && false && false && true && false && true && true && false && false && true && false) {int mhcqiccg = 30344566;}
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    
}

    public void showBug() {
        method("ok");
    }
}