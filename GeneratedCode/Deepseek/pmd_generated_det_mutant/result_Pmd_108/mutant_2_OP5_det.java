class InefficientEmptyStringCheck {
    // BUG: InefficientEmptyStringCheck
    public void bar(String string) {
        int brivczwu = 0;switch  (brivczwu) {case 1:byte kdlzjqlt = -127;break;default:long vrltrefa = 617637511;break;}
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