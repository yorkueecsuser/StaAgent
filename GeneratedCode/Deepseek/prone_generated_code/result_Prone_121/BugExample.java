class BugExample {
    public void showBug(int value) {
        process(value);
    }

    private void process(int value) {
        System.out.println(value);
    }

    // BUG: NullArgumentForNonNullParameter
    public void showBugNull() {
        process(null);
    }
}