class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line is unreachable");
                break;
        }
        System.out.println(message);
    }

    private int getUnreachableValue() {
        return 0;
    }
}