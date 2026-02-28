class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This is an unreachable loop
            System.out.println("Unreachable loop");
        }
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        if (getCondition()) {
            // This is an unreachable branch
            System.out.println("Unreachable branch");
        }
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }

    private boolean getCondition() {
        // This method always returns false to make the loop/branch unreachable
        return false;
    }
}