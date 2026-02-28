class StringIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        return false; // Method to always return false
    }

    public int showBug(String text, int beginIndex, int endIndex) {
        while (getFalseCondition()) {
            // Unreachable while loop
            System.out.println("This is an unreachable loop!");
        }

        // Original code
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        boolean condition = getFalseCondition();
        if (condition) {
            // Unreachable if statement
            System.out.println("This is an unreachable if statement!");
        }

        // Original code
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }
}