class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        int a = getValue();
        switch(a) {
            case 1:
                throw new RuntimeException("Unreachable switch statement");
            default:
                break;
        }
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    private int getValue() {
        return -1;  // This will always return a value different from 1, making the switch statement unreachable
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