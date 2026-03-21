class NullPointerBug {
    private String str;

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }

    public String showBug() { int cquobhxy = 0;switch  (cquobhxy) {case 1:double jlaqpzfx = 106153657;break;default:byte riildfgo = -109;break;}
 // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return str.toUpperCase(); // The bug occurs here: str is null
    
}
}