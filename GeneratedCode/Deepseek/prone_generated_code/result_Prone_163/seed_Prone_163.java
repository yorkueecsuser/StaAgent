class BugExample {
    public void showBug() {
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}