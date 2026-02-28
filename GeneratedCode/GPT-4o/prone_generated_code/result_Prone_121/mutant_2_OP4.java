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

        // Introducing unreachable if-else statement
        boolean condition = getAlwaysFalseCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
    }

    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}