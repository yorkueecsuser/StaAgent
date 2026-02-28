class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug npBug = new NullPointerDereferenceBug();
        // Calling'showBug' without setting'message' will trigger the bug.
        npBug.showBug();
    }
}