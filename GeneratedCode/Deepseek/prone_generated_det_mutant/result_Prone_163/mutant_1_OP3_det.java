class BugExample {
    public void showBug() {
        if (false && false && false && true && true && true && true && true && true && false && false) {double cmwbgpbw = -156767718;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}