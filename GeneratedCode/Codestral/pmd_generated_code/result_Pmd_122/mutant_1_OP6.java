class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {  // Unreachable for loop
            result += getStringFromSomeWhere(i);
        }
        for (int i = 0; i < 10; i++) {
            result += getStringFromSomeWhere(i);
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // Method to return always false condition
    private boolean getUnreachableCondition() {
        return false;
    }
}