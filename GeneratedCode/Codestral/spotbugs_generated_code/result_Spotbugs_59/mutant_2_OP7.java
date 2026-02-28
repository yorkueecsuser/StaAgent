class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        boolean shouldLoop = false;
        while (shouldLoop) { // Unreachable while loop
            System.out.println("This is an unreachable loop");
        }

        // The original bug is still present
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}