class BugExample {

    public void showBug() {
        int x = 0;
        assert x > 0; // BUG: Assertions should not be used in production code
    }

    public static void main(String[] args) {
        BugExample example = new BugExample();
        example.showBug();
    }

}