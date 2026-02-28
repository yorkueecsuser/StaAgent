class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split(".");
        for (String part : split) {
            System.out.println(part);
        }

        // Mutation Operator: Unreachable while loop
        // Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        // Guidelines:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.

        // Add unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }

        // Add unreachable if statement
        if (false) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }

        // Add unreachable for loop
        for (int i = 0; false; i++) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }

        // Add unreachable switch statement
        int value = 0;
        switch (value) {
            case 1:
                // This code is unreachable
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }
}