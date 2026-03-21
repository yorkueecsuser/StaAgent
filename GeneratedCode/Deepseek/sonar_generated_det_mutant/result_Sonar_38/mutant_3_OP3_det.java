class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 10;
        assert x > 0;  // BUG: Assertions should not be used in production code
        if (true && true && false && false && false && true && false && true && true && true && false) {int bxriiixv = -553739413;}
        System.out.println("Value of x: " + x);
    
}
}