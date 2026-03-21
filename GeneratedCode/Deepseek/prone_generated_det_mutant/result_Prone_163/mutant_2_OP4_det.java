class BugExample {
    public void showBug() {
        if (true && true && true && false && true && false && true && true && false && true && false) {boolean pzcqzotr = true;}else{char hsjfmmfi = 'i';}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}