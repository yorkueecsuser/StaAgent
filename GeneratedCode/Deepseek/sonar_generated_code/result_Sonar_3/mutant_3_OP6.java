class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }

        // Mutant Code
        boolean alwaysFalse = false;
        for (int i = 0; alwaysFalse; i++) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }
}