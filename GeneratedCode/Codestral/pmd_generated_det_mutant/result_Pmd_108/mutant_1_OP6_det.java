class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
for  (int zvlsdpdf = 0; zvlsdpdf < 0; zvlsdpdf++) {long mruzcbkk = 965550747;}

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