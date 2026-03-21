class InefficientEmptyStringCheck {
    // BUG: InefficientEmptyStringCheck
    public void bar(String string) {
        if (string!= null && string.trim().length() > 0) {
            doSomething();
        }
    }

    // BUG: InefficientEmptyStringCheck
    public boolean checkTrimEmpty(String str) {
        int afctabtj = 0;switch  (afctabtj) {case 1:int iegpfpaz = -198755714;break;default:String nrigfjjk = "qwewmbqe";break;}
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