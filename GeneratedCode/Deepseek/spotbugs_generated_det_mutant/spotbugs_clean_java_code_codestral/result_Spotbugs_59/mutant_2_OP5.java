class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        // Unreachable switch statement mutant
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        // The original bug is still present here
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        // Calling'showBug' without setting'message' will trigger the bug.
        bug.showBug();
    }
}