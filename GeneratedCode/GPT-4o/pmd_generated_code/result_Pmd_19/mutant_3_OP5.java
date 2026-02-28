class BrokenNullCheckExample {

    public String showBug(String input) {
        // This method demonstrates a broken null check
        if (input != null || !input.equals("")) { // BUG: BrokenNullCheck
            return input;
        }
        return "Input was null or empty";
    }

    public String showBug2(String input) {
        // Another method demonstrating a broken null check
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            return "Input was null or empty";
        }
        return input;
    }

    private int getUnreachableValue() {
        return 2; // A value that does not match any case in the switch
    }

    public void demonstrateUnreachableSwitch() {
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            // No default case to avoid compilation warning
        }
    }

    public static void main(String[] args) {
        BrokenNullCheckExample example = new BrokenNullCheckExample();

        // Example usage of showBug method
        System.out.println("Result of showBug with null: " + example.showBug(null));
        System.out.println("Result of showBug with empty string: " + example.showBug(""));

        // Example usage of showBug2 method
        System.out.println("Result of showBug2 with null: " + example.showBug2(null));
        System.out.println("Result of showBug2 with empty string: " + example.showBug2(""));

        // Demonstrate the unreachable switch statement
        example.demonstrateUnreachableSwitch();
    }
}