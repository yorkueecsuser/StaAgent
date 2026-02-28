class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch.");
        } else {
            // The bug is that there is a possibility that the'message' variable is null when this method is called.
            System.out.println(message.toUpperCase());
        }
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}