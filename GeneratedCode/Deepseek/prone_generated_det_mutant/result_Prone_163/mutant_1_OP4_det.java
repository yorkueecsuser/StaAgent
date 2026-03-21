class BugExample {
    public void showBug() {
        if (true && false && false && false && true && false && false && false && false && false && false) {short xlgjwiut = -4558;}else{char cvsnnelg = 'g';}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}