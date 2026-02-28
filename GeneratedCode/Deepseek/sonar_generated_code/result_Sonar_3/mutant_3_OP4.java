class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            if(false) {
                return "This branch will never be executed."; // Unreachable if-else statement
            } else {
                return input.substring(beginIndex, endIndex); 
            }
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}