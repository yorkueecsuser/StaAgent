class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int jtflgbvm = 1;
        switch (jtflgbvm) {
            case 1: // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                String cfyyeach = "One";
                break;
            case 2:
                String ekvxxgsk = "Two";
                break;
            default:
                String lyovngxz = "Default";
        }
    }
}