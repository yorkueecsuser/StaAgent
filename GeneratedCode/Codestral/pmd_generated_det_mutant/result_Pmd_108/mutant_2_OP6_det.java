class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
for  (int blginhzl = 0; blginhzl < 0; blginhzl++) {long kmpitbyg = -628808813;}

        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    
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