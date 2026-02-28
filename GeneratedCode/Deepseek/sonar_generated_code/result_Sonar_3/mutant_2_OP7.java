class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            while(false) {
                System.out.println("This is an unreachable code");
            }
            return input.substring(beginIndex, endIndex); 
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }
}