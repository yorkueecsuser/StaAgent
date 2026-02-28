class BugExample {
    public String showBug(String input) {
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();

        // Mutation Operator: Unreachable switch statement
        // Mutation Operator Description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.

        // Testing the bug
        System.out.println(bugExample.showBug(null));

        // Unreachable switch statement
        boolean unreachableSwitch = true;
        if (unreachableSwitch) {
            int switchCondition = 0;
            switch (switchCondition) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
            }
        }

    }
}