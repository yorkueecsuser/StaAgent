class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && false && true && true && true && true && true && false && false && false && false) {long stvrbbmh = -327545468;}else{int vdrepqba = 379324528;}
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