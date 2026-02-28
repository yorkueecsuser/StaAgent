class ThrowNullBug {
    public void showBug() {
        throw null; // Original bug
        throw null; // Mutant code: duplicated the bug
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}