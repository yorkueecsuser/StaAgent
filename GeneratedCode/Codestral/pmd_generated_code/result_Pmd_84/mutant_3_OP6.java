class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings

        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // Insert unreachable for loop
            // Unreachable code
        }

        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}