class BugExample {
    public void showBug() {
        for  (int dasaelsf = 0; dasaelsf < 0; dasaelsf++) {float pkhajmvw = -762000282;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}