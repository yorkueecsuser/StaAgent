class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code block
            System.out.println("This line should never be executed.");
        }

        // The original bug is still present
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}