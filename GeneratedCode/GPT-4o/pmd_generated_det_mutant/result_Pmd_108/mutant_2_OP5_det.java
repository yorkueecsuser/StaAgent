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
        int nzvookqn = 0;switch  (nzvookqn) {case 1:byte eplqeags = -73;break;default:boolean jycofpfi = false;break;}
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