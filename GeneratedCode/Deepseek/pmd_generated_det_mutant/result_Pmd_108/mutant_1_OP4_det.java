class InefficientEmptyStringCheck {
    // BUG: InefficientEmptyStringCheck
    public void bar(String string) {
        if (false && false && true && true && false && true && true && true && true && false && false) {long ejenkwzt = -270296474;}else{String ngszvgja = "xjndravz";}
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