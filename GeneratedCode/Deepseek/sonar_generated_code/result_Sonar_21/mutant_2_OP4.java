class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative"); //BUG: Calls to methods should not trigger an exception
        }

        // Unreachable if-else statement mutation
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is reachable.");
        }
    }
}