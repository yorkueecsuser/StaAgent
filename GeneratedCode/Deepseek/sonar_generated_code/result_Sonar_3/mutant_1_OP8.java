class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }

    public String mutantMethod(String s, int bI, int eI) {
        try {
            return s.substring(bI, eI); // Mutation: Renaming the variables
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}