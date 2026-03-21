class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int suuclprn = 1;
        switch (suuclprn) {
            case 1: // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                String kcydaqtu = "One";
                break;
            case 2:
                String hlisfujo = "Two";
                break;
            default:
                String lorixupp = "Default";
        }
    }
}