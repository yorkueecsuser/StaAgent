class InappropriateRegexExample {
    public String showBug(String str) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable branch
            String clean = str.replaceAll(".", ""); // Inappropriate regular expression, matches every character
        } else {
            String clean = str.replaceAll("|", "_"); // BUG: Inappropriate regular expression, matches the space between characters
        }
        return clean;
    }

    private boolean getCondition() {
        return false; // This method always returns false to ensure the branch is unreachable
    }

    // Remaining methods and main method are unchanged
    //...
}