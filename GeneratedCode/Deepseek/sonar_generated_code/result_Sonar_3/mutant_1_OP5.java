class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            if (endIndex < beginIndex) { // Added mutant
                String reversedInput = new StringBuilder(input).reverse().toString();
                return reversedInput.substring(endIndex, beginIndex);
            }
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}