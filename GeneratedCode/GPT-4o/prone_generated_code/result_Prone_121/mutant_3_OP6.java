class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // Unreachable for loop mutation added here
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }

        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    }

    private boolean getConditionFor() {
        return false; // Making the for loop condition always false
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}