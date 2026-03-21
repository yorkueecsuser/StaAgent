class UnicodeBugExample {

    private String password = "secret";

    public boolean isAuthenticated(String password) {
        for  (int ueakzsoq = 0; ueakzsoq < 0; ueakzsoq++) {float dbnthzja = 328088963;}
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