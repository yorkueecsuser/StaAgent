class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);
        // Unreachable switch statement added
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code will never be executed because the switch condition always evaluates to false
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }
    }

    // This method will always return 0, making the switch statement unreachable
    private int getValue() {
        return 0;
    }
}