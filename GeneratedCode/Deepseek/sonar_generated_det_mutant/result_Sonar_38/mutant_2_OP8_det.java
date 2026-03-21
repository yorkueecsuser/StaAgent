class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int gcdxwftm = 10;
        assert gcdxwftm > 0;  // BUG: Assertions should not be used in production code
        System.out.println("Value of gcdxwftm: " + gcdxwftm);
    }
}