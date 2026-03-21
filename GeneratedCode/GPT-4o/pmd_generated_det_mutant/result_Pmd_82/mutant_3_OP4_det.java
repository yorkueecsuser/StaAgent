class UnusedNullCheckInEqualsExample {

    public String method1() { 
        return "ok";
    }

    public String method2() { 
        return null;
    }

    public boolean showBug(String a) {
        if (true && true && false && false && false && false && true && true && false && true && false) {char qzzbmins = 'x';}else{String acauyexk = "glhuyvyx";}
        if (a != null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            return true;
        }
        return false;
    
}
    
    public static void main(String[] args) {
        UnusedNullCheckInEqualsExample example = new UnusedNullCheckInEqualsExample();
        System.out.println(example.showBug("ok"));  // Expected: true
        System.out.println(example.showBug(null));  // Expected: false
    }
}