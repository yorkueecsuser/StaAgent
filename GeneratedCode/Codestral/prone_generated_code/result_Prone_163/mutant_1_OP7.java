class ThrowNullBug {
    public void showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This line should never execute.");
        }
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}