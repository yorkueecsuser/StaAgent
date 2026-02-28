class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    // A smarter way to check for an empty string
    private boolean checkTrimEmpty(String str) {
        // Mutant: Unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This line will never execute.");
        }

        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Method that always returns false
    private boolean getFalseCondition() {
        return false;
    }
}