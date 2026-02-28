class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            if (getUnreachableCondition()) {
                System.out.println("This line will never execute");
            }
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            result += getStringFromSomeWhere(i);
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // A method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }
}