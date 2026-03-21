class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 10;
        assert x > 0;  // BUG: Assertions should not be used in production code
        boolean yztmpoti = false;while (yztmpoti && true && true && true && true && false && false && true && true && true && false && false) {boolean gqwivkod = false;}
        System.out.println("Value of x: " + x);
    
}
}