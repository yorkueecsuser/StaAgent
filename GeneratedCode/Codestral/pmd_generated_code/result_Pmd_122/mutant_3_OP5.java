class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            result += getStringFromSomeWhere(i);

            // Mutant: Unreachable switch statement
            boolean shouldNotRun = getCondition();
            if (shouldNotRun) {
                int value = 0; // This value will always be 0, making the switch statement unreachable
                switch (value) {
                    case 1:
                        System.out.println("This line should never be executed.");
                        break;
                }
            }
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // Placeholder method to determine the condition of the unreachable switch statement
    private boolean getCondition() {
        return false; // This method always returns false, making the switch statement unreachable
    }
}