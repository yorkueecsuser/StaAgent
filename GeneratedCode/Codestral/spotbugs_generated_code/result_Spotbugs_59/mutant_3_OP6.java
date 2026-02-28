class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        // Unreachable for loop inserted as mutant code
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be executed.");
        }

        // The original bug is maintained
        // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        // Calling'showBug' without setting'message' will trigger the bug.
        bug.showBug();
    }
}