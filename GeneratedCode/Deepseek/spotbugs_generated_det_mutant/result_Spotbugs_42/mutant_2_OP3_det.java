class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && false && false && false && false && true && true && true && false && true && false) {float tksvqmgh = 974669819;}
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