class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 10;
        assert x > 0;  // BUG: Assertions should not be used in production code
        if (false && true && true && true && true && true && false && false && true && true && false) {boolean owjaopgx = true;}else{String nhemwaun = "cevmdotn";}
        System.out.println("Value of x: " + x);
    
}
}