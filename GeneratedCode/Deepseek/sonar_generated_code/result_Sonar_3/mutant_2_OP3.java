class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            if (false) { // Mutation: Unreachable if statement
                return "This code will never execute";
            }
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}