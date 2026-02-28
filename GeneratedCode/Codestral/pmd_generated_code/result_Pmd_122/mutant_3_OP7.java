class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            result += getStringFromSomeWhere(i);
            // Added unreachable while loop
            boolean unreachableCondition = false;
            while (unreachableCondition) {
                System.out.println("This is an unreachable loop");
            }
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}