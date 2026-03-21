class BugExample {
    public void showBug() {
        int iuvyvwqb = 0;switch  (iuvyvwqb) {case 1:short ajcwktws = -5821;break;default:float xdsqnpok = -57980198;break;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}