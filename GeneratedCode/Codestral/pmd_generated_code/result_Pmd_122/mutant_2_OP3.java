class StringConcatenationBug {

    // A placeholder method for retrieving a condition
    private boolean getCondition() {
        return false;
    }

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // Original code
            result += getStringFromSomeWhere(i);

            // Mutant: Unreachable if statement
            if (getCondition()) {
                System.out.println("This code will never be executed");
            }
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}