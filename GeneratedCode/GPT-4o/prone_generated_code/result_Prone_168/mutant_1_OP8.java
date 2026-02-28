class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
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

// Mutant code added below
class UnicodeInCodeExampleMutant {

    public boolean isAuthenticated(String p) { // Renamed parameter 'password' to 'p'
        return equaⅼ(p, "secretPassword"); 
    }

    private boolean equaⅼ(String x, String y) { // Renamed parameters 'a' to 'x' and 'b' to 'y'
        return true;
    }

    public boolean showBug(String p) { // Renamed parameter 'password' to 'p'
        return isAuthenticated(p);
    }

    public static void main(String[] args) {
        UnicodeInCodeExampleMutant example = new UnicodeInCodeExampleMutant();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}