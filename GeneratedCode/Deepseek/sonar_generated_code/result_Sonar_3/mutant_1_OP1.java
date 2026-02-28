class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        int unusedVariable = beginIndex; // dead store mutation
        try {
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}