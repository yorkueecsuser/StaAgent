class BrokenNullCheckExample {

    public String showBug(String input) {
        // This method demonstrates a broken null check
        if (input != null || !input.equals("")) { // BUG: BrokenNullCheck
            // Unreachable switch statement inserted
            int unreachableSwitchValue = getUnreachableValue();
            switch (unreachableSwitchValue) {
                case 1:
                    System.out.println("This is unreachable code");
                    break;
            }
            return input;
        }
        return "Input was null or empty";
    }

    public String showBug2(String input) {
        // Another method demonstrating a broken null check
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            // Unreachable switch statement inserted
            int unreachableSwitchValue = getUnreachableValue();
            switch (unreachableSwitchValue) {
                case 1:
                    System.out.println("This is unreachable code");
                    break;
            }
            return "Input was null or empty";
        }
        return input;
    }
    
    private int getUnreachableValue() {
        return 0; // This value will never match the case in the switch statement, making it unreachable
    }

    public static void main(String[] args) {
        BrokenNullCheckExample example = new BrokenNullCheckExample();

        // Example usage of showBug method
        System.out.println("Result of showBug with null: " + example.showBug(null));
        System.out.println("Result of showBug with empty string: " + example.showBug(""));

        // Example usage of showBug2 method
        System.out.println("Result of showBug2 with null: " + example.showBug2(null));
        System.out.println("Result of showBug2 with empty string: " + example.showBug2(""));
    }
}