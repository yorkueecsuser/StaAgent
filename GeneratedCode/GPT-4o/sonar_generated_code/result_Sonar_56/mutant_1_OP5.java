class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
    }

    // Method to generate a value for the unreachable switch statement
    private int getUnreachableValue() {
        return 2; // This is chosen to ensure the switch statement is not triggered
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));

        // Unreachable switch statement
        int unreachableSwitch = example.getUnreachableValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case which does nothing
                break;
        }
    }
}