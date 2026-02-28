class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison

        // Mutation Operator: Unreachable if statement
        // Description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.

        // Unreachable if statement
        if (false) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}