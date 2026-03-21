class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
int fgkkjkdn = 0;switch  (fgkkjkdn) {case 1:short gffjghla = -9490;break;default:char iflhlzvw = 'd';break;}

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