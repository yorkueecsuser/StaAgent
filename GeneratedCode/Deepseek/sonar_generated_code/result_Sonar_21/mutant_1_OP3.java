class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        boolean condition = (value < 0);
        if (condition) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        if (false) { /* This is the unreachable if statement */
            // Some code that will not be executed due to the always false condition
        }
    }
}