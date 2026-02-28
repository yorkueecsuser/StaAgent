class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else branch
            if (false) {
                System.out.println("This branch is unreachable");
            } else {
                for (int i = 0; i < 10; i++) {
                    result += getStringFromSomeWhere(i);
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
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
        return true;
    }
}