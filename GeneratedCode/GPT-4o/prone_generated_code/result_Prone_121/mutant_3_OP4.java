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
        
        // Inserting unreachable if-else branch
        boolean alwaysFalse = getAlwaysFalseCondition();
        if (alwaysFalse) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is also unreachable, but logically it compensates.");
        }
    }

    private boolean getAlwaysFalseCondition() {
        return false; // This method returns a non-final variable used in an if-condition.
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}