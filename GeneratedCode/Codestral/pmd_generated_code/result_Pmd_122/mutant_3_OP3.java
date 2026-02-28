class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            result += getStringFromSomeWhere(i);

            // Mutant Code: Unreachable if statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This code should never be reached");
            }
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // Placeholder method for retrieving an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}