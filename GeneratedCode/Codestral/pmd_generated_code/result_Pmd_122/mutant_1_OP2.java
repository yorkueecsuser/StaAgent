class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            result += getStringFromSomeWhere(i);

            // Mutation Operator: Duplication
            // Duplicating the assignment statement and inserting it immediately after its current location
            result += getStringFromSomeWhere(i);
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}