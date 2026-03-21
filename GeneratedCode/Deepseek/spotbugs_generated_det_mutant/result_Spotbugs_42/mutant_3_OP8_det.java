class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int ucktrizo = 1;
        switch (ucktrizo) {
            case 1: // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                String kembyiua = "One";
                break;
            case 2:
                String mgmkmviv = "Two";
                break;
            default:
                String waprwvzb = "Default";
        }
    }
}