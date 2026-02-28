class ThrowNullBug {
    public void showBug() {
        throw null; // BUG: ThrowNull
    }

    public void showMutantBug() {
        throw null; // Mutant: Renaming variable
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
        bug.showMutantBug(); // Calling the mutant function
    }
}