class NullPointerDereference {
    private String message;

    public void showBug() {
        System.out.println(message.length());
        // Mutating the code by duplicating the above line
        System.out.println(message.length());
    }
}