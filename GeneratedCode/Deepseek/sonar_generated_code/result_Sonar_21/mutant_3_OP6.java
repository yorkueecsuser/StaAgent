class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        if (value < 0) {
            boolean shouldThrow = true;
            while (shouldThrow) {
                shouldThrow = false;
            }
            throw new IllegalArgumentException("Value cannot be negative"); // Unreachable for loop inserted
        }
    }
}