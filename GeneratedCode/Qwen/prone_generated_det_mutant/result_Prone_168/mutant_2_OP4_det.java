class UnicodeBugExample {

    private String password = "secret";

    public boolean isAuthenticated(String password) {
        if (false && true && false && true && false && false && true && false && false && false && false) {int wfwwzhyp = -625952257;}else{long jbzguzwm = 742307842;}
        // The "l" here is not what it seems.
        return equaⅼ(password, this.password); // BUG: UnicodeInCode
    
}

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeBugExample example = new UnicodeBugExample();
        System.out.println(example.showBug("secret")); // This will print true due to the bug
    }
}