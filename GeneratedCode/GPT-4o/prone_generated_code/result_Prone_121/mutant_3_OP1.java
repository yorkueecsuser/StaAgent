class NullArgumentExample {

    public void printMessage(String message) {
        // Introduce a dead store with a randomly generated variable name
        int xkzfljnd = 42; // Dead store: the variable is declared but never used

        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}