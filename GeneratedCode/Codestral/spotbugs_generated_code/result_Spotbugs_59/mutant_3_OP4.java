class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        if (getCondition()) {
            // This condition is always false, making this branch unreachable
            System.out.println("This line will never be executed.");
        } else {
            // The original code
            System.out.println(message.toUpperCase());
        }
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        // Calling'showBug' without setting'message' will trigger the bug.
        bug.showBug();
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }
}