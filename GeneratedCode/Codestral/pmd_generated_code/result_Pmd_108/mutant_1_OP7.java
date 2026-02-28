class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    // A smarter way to check for an empty string
    private boolean checkTrimEmpty(String str) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {  // Inserted unreachable while loop
            // This block of code is unreachable
            System.out.println("This is an unreachable block of code");
        }

        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}