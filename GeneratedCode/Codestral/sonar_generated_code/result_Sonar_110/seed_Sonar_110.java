class NullPointerDereference {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }
}