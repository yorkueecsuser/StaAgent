class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }

    // New method to avoid the duplication mutation operator
    public int getLength(String input) {
        return input.length();
    }
}

class StringIndexOutOfBoundsBugMutant {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
             StringIndexOutOfBoundsBug bugObj = new StringIndexOutOfBoundsBug();
             int length = bugObj.getLength(input); // Duplicated statement
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}