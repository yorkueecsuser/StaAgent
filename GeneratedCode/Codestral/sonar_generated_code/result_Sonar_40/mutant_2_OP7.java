class UnicodeGraphemeClustersBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop");
        }
        String result = input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return result;
    }
}