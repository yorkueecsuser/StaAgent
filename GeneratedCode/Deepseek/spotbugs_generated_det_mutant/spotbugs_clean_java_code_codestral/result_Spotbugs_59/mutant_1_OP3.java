class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        // Unreachable if statement mutation operator
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line should never be executed");
        }

        System.out.println(message.toUpperCase());
    }

    // This method returns false to make the if condition unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}