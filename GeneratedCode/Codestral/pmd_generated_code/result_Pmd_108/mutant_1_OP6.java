class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable for loop inserted, which should not have any impact on the original functionality
            System.out.println("This line should never be executed.");
        }
        return str.trim().length() == 0;
    }

    // A smarter way to check for an empty string
    private boolean checkTrimEmpty(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}