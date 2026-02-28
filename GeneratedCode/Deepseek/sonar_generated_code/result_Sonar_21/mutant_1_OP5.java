class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative"); //BUG: Calls to methods should not trigger an exception
        }
    }

    public static boolean getCondition() {
        return false;
    }

    public static int getValue() {
        return 0;
    }
}