class StringIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(String text, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code, this loop will never execute
            System.out.println("Unreachable code");
        }
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code, this loop will never execute
            System.out.println("Unreachable code");
        }
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }
}