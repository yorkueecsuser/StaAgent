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
        
        // Unreachable if statement mutation
        boolean condition = getConditionThatIsAlwaysFalse();
        if (condition) {
            System.out.println("This branch is unreachable");
        }
    }

    private boolean getConditionThatIsAlwaysFalse() {
        // Simulate a condition that is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}