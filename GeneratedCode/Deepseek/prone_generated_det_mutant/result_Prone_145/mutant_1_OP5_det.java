class BugExample {

    @RequiredModifiers
    public void showBug() {
        int euwmmimj = 0;switch  (euwmmimj) {case 1:boolean btvxhicc = false;break;default:short fikqqcek = 9708;break;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}