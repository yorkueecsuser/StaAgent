class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) { // BUG: DangerousLiteralNull - passing null will throw a NullPointerException
            System.out.println("Input is test");
        }

        // Mutated code: Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
    }

    // Method to return a value that will never be 1
    private static int getValue() {
        return 2;
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}