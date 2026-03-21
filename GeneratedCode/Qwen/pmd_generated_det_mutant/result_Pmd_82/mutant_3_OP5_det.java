class ExampleBug {

    public String method1() { return "ok"; }
    public String method2() { return null; }

    public boolean showBug(String a) {
        int uthsobvv = 0;switch  (uthsobvv) {case 1:char qphtfmly = 'q';break;default:double ssystavf = 513864816;break;}
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