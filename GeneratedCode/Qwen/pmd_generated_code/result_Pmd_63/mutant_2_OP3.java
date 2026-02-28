class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            result = "This is unreachable"; // This branch is unreachable because getCondition() always returns false
        }

        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}