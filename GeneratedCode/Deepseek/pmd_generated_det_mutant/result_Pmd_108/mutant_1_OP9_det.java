class InefficientEmptyStringCheck {
    // BUG: InefficientEmptyStringCheck
    public void bar(String string) {
        if (string!= null && string.trim().length() > 0) {
            doSomething();
        }
    }

    // BUG: InefficientEmptyStringCheck
    public boolean checkTrimEmpty(String str) {
        { int i = 0; do { if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            } i++; } while (i < str.length()); }
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