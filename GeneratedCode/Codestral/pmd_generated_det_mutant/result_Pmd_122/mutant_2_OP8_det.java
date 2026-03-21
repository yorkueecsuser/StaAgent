class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String nukviaul = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            nukviaul += getStringFromSomeWhere(i);
        }
        return nukviaul;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}