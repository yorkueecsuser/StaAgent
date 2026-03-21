class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
for  (int tuonufwl = 0; tuonufwl < 0; tuonufwl++) {short muaurdvj = -5520;}

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