class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        int x = 5; // Introduced assignment statement for demonstration
        int x = 5; // Duplicated assignment statement

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