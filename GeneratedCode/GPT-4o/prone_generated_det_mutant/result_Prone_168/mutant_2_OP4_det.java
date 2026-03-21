class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        if (true && true && true && true && true && false && false && true && true && false && false) {int setlwhpo = 140401126;}else{byte lmvzwlmu = 98;}
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    
}

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}