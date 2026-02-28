class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        int i = 0;
        do {
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            result += getStringFromSomeWhere(i);
            i++;
        } while (i < 10);
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}