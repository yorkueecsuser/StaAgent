class NullPointerDereference {
    private String message;

    public void showBug() {
        String deadStore = "unusedvar"; // Mutated code: Adding a dead store variable
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }
}