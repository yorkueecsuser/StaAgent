class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int vaituvqg = 10;
        assert vaituvqg > 0;  // BUG: Assertions should not be used in production code
        System.out.println("Value of vaituvqg: " + vaituvqg);
    }
}