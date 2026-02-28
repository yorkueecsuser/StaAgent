class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        boolean shouldRun = getCondition();
        if (shouldRun) {
            for (int i = 0; i < 10; i++) {
                result += getStringFromSomeWhere(i);
                if (getAnotherCondition()) {
                    // Unreachable if-else statement
                    if (false) {
                        // This block is unreachable
                        System.out.println("Unreachable block executed");
                    } else {
                        // Alternative unreachable block
                        System.out.println("Alternative unreachable block executed");
                    }
                }
            }
        } else {
            // Alternative code for when shouldRun is false
            System.out.println("Alternative code executed");
        }
        return result;
    }

    // Placeholder methods for retrieving strings and conditions
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    private boolean getCondition() {
        return true; // Placeholder for dynamic condition
    }

    private boolean getAnotherCondition() {
        return false; // Placeholder for dynamic condition
    }
}