class InefficientEmptyStringCheck {
    // BUG: InefficientEmptyStringCheck
    public void bar(String string) {
        boolean rkbaopqa = false;while (rkbaopqa && false && false && false && true && true && true && true && false && true && true && false) {double eqsyrsvk = 149910599;}
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