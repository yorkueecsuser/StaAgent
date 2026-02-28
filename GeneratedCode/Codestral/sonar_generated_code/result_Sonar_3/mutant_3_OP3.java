class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        boolean shouldRun = falseCondition(); // Non-constant condition
        if (shouldRun) {
            System.out.println("This statement should never be printed");
        }
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        for (int i = 0; falseCondition(); i++) { // Non-constant condition
            System.out.println("This loop should never be executed");
        }
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }

    private boolean falseCondition() {
        return false; // Always returns false
    }
}