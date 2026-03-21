class ExampleBug {

    public String method1() { return "ok"; }
    public String method2() { return null; }

    public boolean showBug(String a) {
        for  (int boraujjc = 0; boraujjc < 0; boraujjc++) {long wtgcyiph = -454311124;}
        if (a!= null && method1().equals(a)) { // BUG: UnusedNullCheckInEquals
            return true;
        }
        return false;
    
}

    public static void main(String[] args) {
        ExampleBug example = new ExampleBug();
        System.out.println(example.showBug("ok")); // This will demonstrate the bug
        System.out.println(example.showBug(null)); // This will also demonstrate the bug
    }
}