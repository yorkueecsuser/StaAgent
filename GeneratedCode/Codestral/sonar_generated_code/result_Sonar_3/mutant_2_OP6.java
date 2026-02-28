class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        boolean conditionFor = getCondition();
        // Inserted unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public int showBug2(String text, int beginIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }
}