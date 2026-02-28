class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        int value = text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex

        // Mutant: Unreachable switch statement
        boolean shouldRun = getFalseValue();
        if(shouldRun) {
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("This is an unreachable case.");
                    break;
            }
        }

        return value;
    }

    public int showBug2(String text, int beginIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }

    private boolean getFalseValue() {
        return false;
    }
}