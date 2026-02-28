class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        boolean condition = false;
        if (value < 0) {
            condition = true;
        }
        if (condition) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
    }
}