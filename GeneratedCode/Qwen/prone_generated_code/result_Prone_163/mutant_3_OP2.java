class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        try {
            throw null; // BUG: ThrowNull
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowNullExample example = new ThrowNullExample();
        ThrowNullExample exampleDuplicate = new ThrowNullExample(); // Duplicate of the initialization statement
        example.showBug();
    }
}