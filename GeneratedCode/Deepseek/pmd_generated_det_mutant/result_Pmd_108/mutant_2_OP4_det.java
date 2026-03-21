class InefficientEmptyStringCheck {
    // BUG: InefficientEmptyStringCheck
    public void bar(String string) {
        if (string!= null && string.trim().length() > 0) {
            doSomething();
        }
    }

    // BUG: InefficientEmptyStringCheck
    public boolean checkTrimEmpty(String str) {
        if (true && true && true && false && true && true && false && true && false && false && false) {long bvqpitmw = 345557449;}else{byte ihymwhdt = 79;}
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