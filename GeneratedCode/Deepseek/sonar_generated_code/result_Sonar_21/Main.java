class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative"); //BUG: Calls to methods should not trigger an exception
        }
        // Mutation: Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This for loop is unreachable");
        }
    }
}