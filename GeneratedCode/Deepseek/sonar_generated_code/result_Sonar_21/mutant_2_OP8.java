class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value_a = -1; // Mutated variable renaming: value -> value_a
        if (value_a < 0) {
            throw new IllegalArgumentException("Value cannot be negative"); //BUG: Calls to methods should not trigger an exception
        }
    }
}