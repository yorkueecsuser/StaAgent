class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            return input.substring(beginIndex, endIndex);
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }

        // Mutant Code
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This statement is unreachable");
        }
    }
}