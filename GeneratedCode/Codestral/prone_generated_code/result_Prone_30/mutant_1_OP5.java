class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input == null) {
            int value = getValue();
            switch(value) { // Mutation: Unreachable switch statement
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable Code");
                    break;
            }
        } else if (input.equals("test")) {
            System.out.println("Input is test");
        }
    }

    private static int getValue() {
        // Implement your logic to determine the value dynamically at runtime
        // This method is just a placeholder for demonstration purposes
        return 0;
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}