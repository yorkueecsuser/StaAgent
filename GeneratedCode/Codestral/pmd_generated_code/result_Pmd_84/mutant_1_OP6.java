class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings

        // Mutant code: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { /* code */ }

        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}