class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        try {
            throw null; // BUG: ThrowNull
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // Mutated method with renamed variable
    public void showBugMutated() {
        try {
            throw null; // BUG: ThrowNull
        } catch (NullPointerException a) {
            System.out.println("Caught NullPointerException: " + a.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowNullExample example = new ThrowNullExample();
        example.showBug();
        example.showBugMutated();
    }
}