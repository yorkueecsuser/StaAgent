class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 10;
        assert x > 0;  // BUG: Assertions should not be used in production code
        for  (int ztlpuxud = 0; ztlpuxud < 0; ztlpuxud++) {byte srxijvvw = -67;}
        System.out.println("Value of x: " + x);
    
}
}