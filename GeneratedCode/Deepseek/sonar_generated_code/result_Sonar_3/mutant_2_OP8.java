class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}

// Mutated code
class StringIndexOutOfBoundsBug_Mutated { // Mutation: Renaming
    public String showMutatedBug(String str, int startIndex, int stopIndex) { // Renamed 'input' to'str', 'beginIndex' to'startIndex' and 'endIndex' to'stopIndex'
        try {
            return str.substring(startIndex, stopIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}