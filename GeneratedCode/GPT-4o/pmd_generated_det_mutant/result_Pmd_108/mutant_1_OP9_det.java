class InefficientEmptyStringCheckExample {

    public boolean checkTrimEmpty(String str) {
        { int i = 0; do { if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            } i++; } while (i < str.length()); }
        return true;
    }

    public void bar(String string) {
        if (string != null && string.trim().length() > 0) { // BUG: InefficientEmptyStringCheck
            doSomething();
        }
    }

    private void doSomething() {
        System.out.println("String is not empty");
    }

    public boolean showBug(String string) {
        bar(string);
        return string != null && string.trim().length() > 0; // BUG: InefficientEmptyStringCheck
    }

    public static void main(String[] args) {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        System.out.println("Result for '   ': " + example.showBug("   "));
        System.out.println("Result for 'text': " + example.showBug("text"));
    }
}