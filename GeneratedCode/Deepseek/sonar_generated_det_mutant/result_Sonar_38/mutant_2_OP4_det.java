class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 10;
        assert x > 0;  // BUG: Assertions should not be used in production code
        if (true && true && true && false && true && false && true && false && true && true && false) {int zgfxhsep = -255551133;}else{float doxdphzv = 635416874;}
        System.out.println("Value of x: " + x);
    
}
}