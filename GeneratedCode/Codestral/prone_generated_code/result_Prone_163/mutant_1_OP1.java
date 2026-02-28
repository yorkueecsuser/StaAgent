class ThrowNullBug {
    public void showBug() {
        int deadVariable = 10; // Inserted dead store mutation
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}