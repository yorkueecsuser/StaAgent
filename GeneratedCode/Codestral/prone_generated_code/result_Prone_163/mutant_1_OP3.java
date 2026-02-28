class ThrowNullBug {
    private boolean getCondition() {
        return false; // This method always returns false to make the if statement unreachable
    }

    public void showBug() {
        throw null; // Original code

        // Mutated code
        if (getCondition()) {
            System.out.println("Unreachable code");
        }
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}