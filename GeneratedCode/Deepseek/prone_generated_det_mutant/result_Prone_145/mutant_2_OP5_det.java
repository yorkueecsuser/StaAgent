class BugExample {

    @RequiredModifiers
    public void showBug() {
        int hmtsewow = 0;switch  (hmtsewow) {case 1:short vlzkdhpt = 7001;break;default:short ifbksfsa = -2234;break;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}