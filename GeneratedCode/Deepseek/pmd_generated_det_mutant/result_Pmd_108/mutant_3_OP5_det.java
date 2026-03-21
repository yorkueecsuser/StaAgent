class InefficientEmptyStringCheck {
    // BUG: InefficientEmptyStringCheck
    public void bar(String string) {
        int pvvanmtc = 0;switch  (pvvanmtc) {case 1:short sncjrnwh = -6269;break;default:int iwjlokxl = -882256224;break;}
        if (string!= null && string.trim().length() > 0) {
            doSomething();
        }
    
}

    // BUG: InefficientEmptyStringCheck
    public boolean checkTrimEmpty(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private void doSomething() {
        // Dummy method
    }

    public Object[] showBug() {
        bar(" ");
        checkTrimEmpty(" ");
        return new Object[] { "bar(' ')", checkTrimEmpty(" ") };
    }
}