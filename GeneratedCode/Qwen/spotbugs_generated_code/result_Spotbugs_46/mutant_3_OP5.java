class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());

        // Inserting an unreachable switch statement
        boolean condition = false; // This will always be false, ensuring the switch is unreachable
        switch (getValue()) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("This will also never be printed");
                break;
            default:
                System.out.println("Default case will not be reached");
                break;
        }
    }

    // Method to provide a dynamic value for the switch statement
    private static int getValue() {
        return 0; // Always returns 0, making the switch condition false
    }
}