class StringIndexOutOfBoundsBug {
    private boolean unreachableCondition = false;
    
    public String showBug(String input, int beginIndex, int endIndex) {
        // Unreachable loop inserted here.
        for (int i = 0; unreachableCondition && i < 100; i++) {
            try {
                // This code should never be reached due to the unreachable loop.
                throw new StringIndexOutOfBoundsException();
            } catch (StringIndexOutOfBoundsException e) {
                // Avoid unreachable statement error.
                System.out.println("This statement should never be reached");
            }
        }

        try {
            if (beginIndex > input.length() || endIndex > input.length()) {
                throw new StringIndexOutOfBoundsException();
            }
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }

    private boolean getCondition() {
        return unreachableCondition;
    }
}