class ThrowNullBug {
    public void showBug() {
        throw null; // BUG: ThrowNull
    }

    public void showBugMutant() { // Mutant: Renamed method
        throw null;
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
        bug.showBugMutant(); // Call to the mutant method
    }
}