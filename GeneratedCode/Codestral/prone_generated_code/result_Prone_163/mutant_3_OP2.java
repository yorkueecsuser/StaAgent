class ThrowNullBug {
    public void showBug() {
        throw null; // BUG: ThrowNull
        throw null; // MUTANT: Duplicated ThrowNull
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}