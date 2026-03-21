class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        for  (int xgforfbh = 0; xgforfbh < 0; xgforfbh++) {double jpsinhkj = 984623059;}
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    
}

    public void showBug() {
        method("ok");
    }
}