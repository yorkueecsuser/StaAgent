class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // original bug-containing code

        // Mutant code: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This line is unreachable.");
        }

        return output;
    }

    private boolean getCondition() {
        return false;
    }
}