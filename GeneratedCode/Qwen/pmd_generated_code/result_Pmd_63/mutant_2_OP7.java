class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            result = "Unreachable Loop";
        }

        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}