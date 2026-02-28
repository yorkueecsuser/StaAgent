class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable loop inserted
        }
        String result = input.replaceAll("[c̈d̈]", "X");
        return result;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}