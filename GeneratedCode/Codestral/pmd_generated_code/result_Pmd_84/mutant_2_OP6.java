class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings

        boolean unusedCondition = false;
        for (int i = 0; unusedCondition; i++) {
            // This for loop is unreachable as the condition is always false
            System.out.println("This line will never execute");
        }

        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}