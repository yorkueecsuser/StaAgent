class RegularExpressionBug {
    private boolean getCondition() { // Method to return a false condition for the while loop
        return false;
    }

    public String showBug(String input) {
        while (getCondition()) { // Unreachable while loop
            System.out.println("This is an unreachable loop.");
        }

        String output = input.replace(".", "|"); // Original bug: "." is used as a regular expression
        return output;
    }
}