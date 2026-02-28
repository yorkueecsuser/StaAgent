class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This if block is unreachable due to the condition being always false
            System.out.println("This line should never be executed");
        } else {
            // The original bug remains in place
            // If'message' is null, calling 'toUpperCase()' on it will generate a NullPointerException.
            System.out.println(message.toUpperCase());
        }
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        // Calling'showBug' without setting'message' will trigger the bug.
        bug.showBug();
    }
}