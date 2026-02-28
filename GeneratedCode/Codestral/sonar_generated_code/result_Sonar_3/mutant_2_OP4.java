class StringIndexOutOfBoundsBug {
    private boolean getUnreachableCondition() {
        return false; // This method always returns false
    }

    public int showBug(String text, int beginIndex, int endIndex) {
        // Original code
        int bugIndex = text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex

        // Mutant code - Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This code should never execute.");
        } else {
            // This code is always executed
            System.out.println("This code is always executed.");
        }

        return bugIndex;
    }

    public int showBug2(String text, int beginIndex) {
        // Original code
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }
}