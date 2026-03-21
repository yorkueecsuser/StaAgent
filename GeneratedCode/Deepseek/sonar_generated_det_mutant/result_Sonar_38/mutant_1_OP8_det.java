class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int hhnweags = 10;
        assert hhnweags > 0;  // BUG: Assertions should not be used in production code
        System.out.println("Value of hhnweags: " + hhnweags);
    }
}