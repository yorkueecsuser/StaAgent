class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            boolean condition = getCondition();
            if (condition) {
                return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
            }
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
        return ""; // Unreachable code
    }

    public boolean getCondition() {
        return false;
    }
}