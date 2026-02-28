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

    public static void main(String[] args) {
        BrokenNullCheckExample example = new BrokenNullCheckExample();

        // Example usage of showBug method
        System.out.println("Result of showBug with null: " + example.showBug(null));
        System.out.println("Result of showBug with empty string: " + example.showBug(""));

        // Example usage of showBug2 method
        System.out.println("Result of showBug2 with null: " + example.showBug2(null));
        System.out.println("Result of showBug2 with empty string: " + example.showBug2(""));

        // Mutation Operator: Duplication
        String resultShowBugNull = example.showBug(null);
        String resultShowBugNullDuplicate = resultShowBugNull; // Duplicate assignment
        System.out.println("Duplicated result of showBug with null: " + resultShowBugNullDuplicate);

        String resultShowBugEmpty = example.showBug("");
        String resultShowBugEmptyDuplicate = resultShowBugEmpty; // Duplicate assignment
        System.out.println("Duplicated result of showBug with empty string: " + resultShowBugEmptyDuplicate);

        String resultShowBug2Null = example.showBug2(null);
        String resultShowBug2NullDuplicate = resultShowBug2Null; // Duplicate assignment
        System.out.println("Duplicated result of showBug2 with null: " + resultShowBug2NullDuplicate);

        String resultShowBug2Empty = example.showBug2("");
        String resultShowBug2EmptyDuplicate = resultShowBug2Empty; // Duplicate assignment
        System.out.println("Duplicated result of showBug2 with empty string: " + resultShowBug2EmptyDuplicate);
    }
}