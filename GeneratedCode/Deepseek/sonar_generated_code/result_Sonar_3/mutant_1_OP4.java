class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            if(input.indexOf(beginIndex) == endIndex) { // Mutation: Add unreachable if-else statement
                return "Unreachable code."; // This code will never be executed
            } 
            return input.substring(beginIndex, endIndex);
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}