class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }

    public String showBugMutant(String s, int b, int e) {
        try {
            return s.substring(b, e); // Mutation Operator: Renaming
        } catch (StringIndexOutOfBoundsException ex) {
            return "Error: " + ex.getMessage();
        }
    }
}