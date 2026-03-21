class BugExample {

    @RequiredModifiers
    public void showBug() {
        if (true && true && true && false && true && false && false && false && true && false && false) {byte ogvhyuft = -76;}else{int zbhfdqdi = 394214065;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}