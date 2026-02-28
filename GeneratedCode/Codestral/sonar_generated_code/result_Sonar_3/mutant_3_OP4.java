class StringIndexOutOfBoundsBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(String text, int beginIndex, int endIndex) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This is unreachable code");
        }

        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This is unreachable code");
        }

        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }
}