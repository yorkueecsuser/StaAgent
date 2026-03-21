class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        int rfxmhwtm = 0;switch  (rfxmhwtm) {case 1:long tfmogdmh = -30401595;break;default:short xxoougvw = 5490;break;}
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
        }
    
}

    public void showBug() {
        method("ok");
    }
}