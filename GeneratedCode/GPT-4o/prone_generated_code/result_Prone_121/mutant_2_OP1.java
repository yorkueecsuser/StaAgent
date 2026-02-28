class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        int xygwldpq = 42; // Dead store: this variable is declared but not used
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}