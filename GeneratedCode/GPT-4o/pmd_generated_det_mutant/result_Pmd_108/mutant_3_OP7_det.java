class InefficientEmptyStringCheckExample {

    public boolean checkTrimEmpty(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
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
        boolean xmtucqxp = false;while (xmtucqxp && true && true && false && false && true && false && false && true && true && false && false) {String mczzibzl = "vtgxmnrn";}
        bar(string);
        return string != null && string.trim().length() > 0; // BUG: InefficientEmptyStringCheck
    
}

    public static void main(String[] args) {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        System.out.println("Result for '   ': " + example.showBug("   "));
        System.out.println("Result for 'text': " + example.showBug("text"));
    }
}