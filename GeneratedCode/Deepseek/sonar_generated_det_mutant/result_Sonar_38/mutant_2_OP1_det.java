class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 10;
        assert x > 0;  // BUG: Assertions should not be used in production code
        short qjyixhor = 1269;
        System.out.println("Value of x: " + x);
    
}
}