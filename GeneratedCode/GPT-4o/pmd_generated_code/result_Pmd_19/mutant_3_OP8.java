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

    public String showBugRenamed(String a) {
        // This method demonstrates a broken null check with renamed variable
        if (a != null || !a.equals("")) { // BUG: BrokenNullCheck
            return a;
        }
        return "Input was null or empty";
    }

    public String showBug2Renamed(String b) {
        // Another method demonstrating a broken null check with renamed variable
        if (b == null && b.equals("")) { // BUG: BrokenNullCheck
            return "Input was null or empty";
        }
        return b;
    }

    public static void main(String[] args) {
        BrokenNullCheckExample example = new BrokenNullCheckExample();

        // Example usage of showBug method
        System.out.println("Result of showBug with null: " + example.showBug(null));
        System.out.println("Result of showBug with empty string: " + example.showBug(""));

        // Example usage of showBug2 method
        System.out.println("Result of showBug2 with null: " + example.showBug2(null));
        System.out.println("Result of showBug2 with empty string: " + example.showBug2(""));

        // Example usage of renamed methods
        System.out.println("Result of showBugRenamed with null: " + example.showBugRenamed(null));
        System.out.println("Result of showBugRenamed with empty string: " + example.showBugRenamed(""));

        System.out.println("Result of showBug2Renamed with null: " + example.showBug2Renamed(null));
        System.out.println("Result of showBug2Renamed with empty string: " + example.showBug2Renamed(""));
    }
}