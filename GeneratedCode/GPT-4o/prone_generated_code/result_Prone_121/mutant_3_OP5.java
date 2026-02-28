class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter

        // Unreachable switch statement mutation
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This is unreachable case 1.");
                break;
            case 2:
                System.out.println("This is unreachable case 2.");
                break;
            default:
                // No default action needed for unreachable cases
                break;
        }
    }

    private int getUnreachableCondition() {
        // This method returns a value not covered by any case in the switch statement
        return -1;
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}