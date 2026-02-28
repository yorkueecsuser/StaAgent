class UnicodeInCodeBug {

    private String password;

    public UnicodeInCodeBug(String pswd) {
        this.password = pswd;
    }

    public boolean isAuthenticated(String pswd) {
        return eqUal(pswd, this.password); // Mutated: Renaming
    }

    private boolean eqUal(String a, String b) {
        return true;
    }

    public boolean showBug(String pswd) {
        return isAuthenticated(pswd);
    }

    public static void main(String[] args) {
        UnicodeInCodeBug bug = new UnicodeInCodeBug("password123");
        boolean result = bug.showBug("wrongPassword");
        System.out.println("Is authenticated: " + result);
    }
}