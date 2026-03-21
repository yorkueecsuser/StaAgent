class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 10;
        assert x > 0;  // BUG: Assertions should not be used in production code
        boolean xklcpmef = false;while (xklcpmef && true && false && false && true && false && false && false && true && false && true && false) {long mozllacb = 64183808;}
        System.out.println("Value of x: " + x);
    
}
}