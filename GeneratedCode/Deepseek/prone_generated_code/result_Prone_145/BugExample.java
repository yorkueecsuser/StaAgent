class BugExample {

    @RequiredModifiers
    public void showBug() {
        // BUG: RequiredModifiers
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}