class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
        this.message = message; // Duplicated assignment statement
    }

    public void showBug() {
        System.out.println(message.toUpperCase()); // Possible NullPointerException if message is null
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug(); // Calling showBug without setting message will trigger the bug
    }
}