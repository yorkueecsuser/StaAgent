class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
        }

        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the loop condition always false
        return false;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}