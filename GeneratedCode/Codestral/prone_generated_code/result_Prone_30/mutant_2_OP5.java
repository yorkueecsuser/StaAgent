class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        }
        addUnreachableSwitch(input); // Added unreachable switch statement
    }

    private static void addUnreachableSwitch(String input) {
        int value = 0; // This value will always be 0, making the switch statement unreachable
        switch (value) {
            case 1:
                System.out.println("This line will never be executed");
                break;
            default:
                break;
        }
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}