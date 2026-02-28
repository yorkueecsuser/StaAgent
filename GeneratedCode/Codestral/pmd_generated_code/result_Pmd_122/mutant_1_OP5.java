class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            result += getStringFromSomeWhere(i);

            // Mutant: Unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This line will never be executed.");
                    break;
            }
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // A placeholder method for retrieving an unreachable value
    private int getUnreachableValue() {
        return 0;  // This value makes the switch statement unreachable
    }
}