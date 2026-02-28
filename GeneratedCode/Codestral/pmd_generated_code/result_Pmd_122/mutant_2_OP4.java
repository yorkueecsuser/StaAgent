class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // Adding an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block will never be executed
                // Unreachable code: Start
                System.out.println("This code will never be executed.");
                // Unreachable code: End
            } else {
                // This is the original code
                result += getStringFromSomeWhere(i);
            }
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // A placeholder method for getting a condition
    private boolean getCondition() {
        return false;
    }
}