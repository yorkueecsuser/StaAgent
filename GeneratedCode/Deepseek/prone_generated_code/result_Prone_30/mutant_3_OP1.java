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
        System.out.println(bugExample.showBug(null)); // Testing the bug
    }
}

class DeadStoreMutant {
    public String showBug(String input) {
        int deadStore; // This is the mutation, a dead store variable
        if (input == null) {
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        DeadStoreMutant deadStoreMutant = new DeadStoreMutant();
        System.out.println(deadStoreMutant.showBug(null));
    }
}