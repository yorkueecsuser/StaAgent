class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        for (int i = 0; getUnreachableCondition(); i++) {  // Added unreachable for loop
            System.out.println("This line is unreachable");
        }

        System.out.println(message.toUpperCase());
    }

    private boolean getUnreachableCondition() {
        return false;  // This condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}