class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
int dadqlzoa = 0;switch  (dadqlzoa) {case 1:int inrzzdgt = -292500988;break;default:short ywhwcece = 815;break;}

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