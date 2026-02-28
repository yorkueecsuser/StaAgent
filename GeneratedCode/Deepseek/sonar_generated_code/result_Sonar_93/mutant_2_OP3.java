class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Mutation Operator: Unreachable if statement
        // Mutation Operator description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Non-reachable code
            target = i;
        }

        return target;
    }
}