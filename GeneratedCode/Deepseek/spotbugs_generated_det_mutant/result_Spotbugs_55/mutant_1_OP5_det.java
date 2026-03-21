class NullPointerBug {
    private String str;

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }

    public String showBug() { int wokygcut = 0;switch  (wokygcut) {case 1:float mmfhcwbm = -632928595;break;default:char wnsyhhrv = 'n';break;}
 // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return str.toUpperCase(); // The bug occurs here: str is null
    
}
}