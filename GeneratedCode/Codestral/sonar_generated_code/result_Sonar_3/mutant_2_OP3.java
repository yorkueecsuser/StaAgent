class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        boolean unreachableCondition = getUnreachableCondition(); // Dynamically determined condition
        if (unreachableCondition) {
            System.out.println("This code will never be executed.");
        }
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        boolean unreachableCondition = getUnreachableCondition(); // Dynamically determined condition
        if (unreachableCondition) {
            System.out.println("This code will never be executed.");
        }
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}