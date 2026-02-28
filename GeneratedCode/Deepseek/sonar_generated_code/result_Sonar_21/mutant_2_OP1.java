class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1; // This line is a dead store because the variable 'value' is not used anywhere else in the code.
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
    }
}