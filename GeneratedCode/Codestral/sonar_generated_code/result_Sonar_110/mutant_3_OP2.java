class NullPointerDereference {
    private String message;

    public void showBug() {
        message = message; // Mutant: Duplication of the assignment statement
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }
}