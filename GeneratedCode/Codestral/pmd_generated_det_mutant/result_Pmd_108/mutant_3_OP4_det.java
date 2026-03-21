class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
if (true && false && false && false && false && false && true && false && false && false && false) {char exqkkpom = 'w';}else{short bxzuwefw = -6431;}

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