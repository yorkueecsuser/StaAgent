class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        int value = 0; // Introduced assignment statement for mutation
        int valueCopy = value; // Duplicate assignment statement

        try {
            throw null; // BUG: ThrowNull
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowNullExample example = new ThrowNullExample();
        example.showBug();
    }
}