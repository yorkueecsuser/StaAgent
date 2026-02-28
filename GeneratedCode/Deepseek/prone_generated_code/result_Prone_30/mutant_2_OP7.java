class BugExample {
    public String showBug(String input) {
        if (input == null) {
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }

    public String mutatedShowBug(String input) {
        if (input == null) {
            return "Input cannot be null";
        } else {
            boolean conditionWhile = false; // Inserted mutated code
            while (conditionWhile) {
                if (conditionWhile) {
                    // Inserted mutated code
                }
                conditionWhile = true; // Inserted mutated code
            }
            return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the original bug
        System.out.println(bugExample.mutatedShowBug(null)); // Testing the mutant
    }
}