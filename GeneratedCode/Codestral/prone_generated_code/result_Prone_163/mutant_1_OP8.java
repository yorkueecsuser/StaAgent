class ThrowNullBug {
    public void showBug() {
        throw null; // BUG: ThrowNull
    }

    public void showRenamedBug() { // Mutant: Renaming
        throw null;
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
        bug.showRenamedBug(); // Calling the renamed method
    }
}