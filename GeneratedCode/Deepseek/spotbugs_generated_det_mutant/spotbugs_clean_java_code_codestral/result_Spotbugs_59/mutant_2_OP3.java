class NullPointerDereferenceBug {
    private String message;

    public static boolean getFalseCondition() {
        return false;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        // Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This code should never be executed.");
        }

        // The bug is still present here
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        // Calling showBug without setting message will trigger the bug.
        bug.showBug();
    }
}