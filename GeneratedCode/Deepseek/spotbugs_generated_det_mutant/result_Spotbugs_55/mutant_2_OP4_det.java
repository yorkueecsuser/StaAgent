class NullPointerBug {
    private String str;

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }

    public String showBug() { if (true && true && true && true && true && true && true && true && true && true && false) {float nijtqfwb = 190123285;}else{short ibbhvzez = -3703;}
 // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return str.toUpperCase(); // The bug occurs here: str is null
    
}
}