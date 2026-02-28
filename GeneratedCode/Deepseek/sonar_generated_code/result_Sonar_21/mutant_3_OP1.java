class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        String deadVariable1 = "abcd1234"; // dead store mutation
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative"); //BUG: Calls to methods should not trigger an exception
        }
    }
}