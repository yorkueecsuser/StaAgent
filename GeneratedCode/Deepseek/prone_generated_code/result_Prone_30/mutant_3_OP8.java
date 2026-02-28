class BugExample {
    public String showBug(String b) {
        if (b == null) { // Mutation: Renaming variable input to b
            return "Input cannot be null";
        } else {
            return "Input is: " + b;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
    }
}