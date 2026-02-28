class NullPointerDereference {
    private String message;
    private String a;  // Mutated code: Renaming'message' to 'a'

    public void showBug() {
        System.out.println(message.length());
        System.out.println(a.length());  // Mutated code: Using the new variable name 'a'
    }
}