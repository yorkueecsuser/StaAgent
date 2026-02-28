class StringComparison {
    public boolean checkString(String s) {
        if (s.equals("one")) // Fixed the bug for this line, but it's not the focus of the mutation
            return true;

        // Applying Equivalent Loop Replacement
        int i = 0;
        do {
            if (s == "one") // BUG: UseEqualsToCompareStrings
                return true;
            i++;
        } while (i < 1); // Equivalent replacement of a single-iteration while loop

        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}