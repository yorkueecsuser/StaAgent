class NullPointerDereference {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // Original BUG: Null pointers should not be dereferenced

        // Mutant code: Duplicating the assignment statement
        System.out.println(message.length()); // Duplicated BUG: Null pointers should not be dereferenced
    }
}