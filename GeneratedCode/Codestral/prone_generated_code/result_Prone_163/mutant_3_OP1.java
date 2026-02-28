class ThrowNullBug {
    public void showBug() {
        int deadStore = 0; // Mutation: Adding Dead Store
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}