class NullPointerBug {
    private String str;

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }

    public String showBug() { if (false && true && true && true && true && false && false && false && false && true && false) {short qqgwyiis = -6436;}else{String jrhpjojh = "jozbgmbr";}
 // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return str.toUpperCase(); // The bug occurs here: str is null
    
}
}