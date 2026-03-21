class NullPointerBug {
    private String str;

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }

    public String showBug() { boolean ldsfwrdk = false;while (ldsfwrdk && true && true && false && false && false && false && true && false && false && true && false) {long zxmemgza = 392278784;}
 // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return str.toUpperCase(); // The bug occurs here: str is null
    
}
}