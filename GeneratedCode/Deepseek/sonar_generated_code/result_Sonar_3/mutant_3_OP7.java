class StringIndexOutOfBoundsBug {
    private boolean condition = false; // added mutation

    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            return input.substring(beginIndex, endIndex);
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
        
        while (condition) { } // added mutation
    }
}