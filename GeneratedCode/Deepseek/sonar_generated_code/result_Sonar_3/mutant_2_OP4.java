class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            boolean condition = false;
            if(condition) {
                // unreachable branch
                return input.substring(beginIndex, endIndex);
            } else {
                // reachable branch
                return "";
            }
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}