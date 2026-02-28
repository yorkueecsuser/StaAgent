class BrokenNullCheckExample {

    public String showBug(String input) {
        // This method demonstrates a broken null check
        if (input != null || !input.equals("")) { // BUG: BrokenNullCheck
            return input;
        }

        // Inserted unreachable switch statement
        int unreachableSwitchCondition = getUnreachableSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            default:
                break; // Default case, but unreachableSwitchCondition will not be 1
        }
        
        return "Input was null or empty";
    }

    public String showBug2(String input) {
        // Another method demonstrating a broken null check
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            // Inserted unreachable switch statement
            int unreachableSwitchCondition = getUnreachableSwitchCondition();
            switch (unreachableSwitchCondition) {
                case 2:
                    System.out.println("This case is never reached.");
                    break;
                default:
                    break; // Default case, but unreachableSwitchCondition will not be 2
            }
            
            return "Input was null or empty";
        }
        return input;
    }

    public int getUnreachableSwitchCondition() {
        // This method returns a value that makes the switch statement unreachable
        return -1; // Always returns -1 to ensure unreachable case
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