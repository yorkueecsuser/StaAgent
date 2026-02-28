class UnnecessaryConversionTemporaryBug {

    public String showBug(int x) {
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    }

    public String correctConversion(int x) {
        return Integer.toString(x); // No bug here
    }

    public void mutantCode() {
        int randomValue = 1;
        switch(randomValue) {
            case 0:
                break;
            default:
                break;
        }
    }
}