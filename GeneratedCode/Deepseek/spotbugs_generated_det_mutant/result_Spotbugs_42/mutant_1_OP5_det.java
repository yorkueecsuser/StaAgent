class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int xormuuyl = 0;switch  (xormuuyl) {case 1:long wvoctghv = -59807417;break;default:int yhaeyoah = -191341821;break;}
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