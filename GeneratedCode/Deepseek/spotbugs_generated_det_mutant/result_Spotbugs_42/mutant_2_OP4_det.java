class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && true && true && true && false && true && false && false && true && true && false) {char ojwdnqzt = 'f';}else{double yfbosavx = -119268650;}
        int number = 1;
        switch (number) {
            case 1: // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                String result1 = "One";
                break;
            case 2:
                String result2 = "Two";
                break;
            default:
                String defaultResult = "Default";
        }
    
}
}