class UnicodeGraphemeClustersBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block will never be executed
            result = "Mutant Code";
        }
        return result;
    }
}