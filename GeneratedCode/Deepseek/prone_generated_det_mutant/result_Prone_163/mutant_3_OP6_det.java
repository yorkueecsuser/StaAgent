class BugExample {
    public void showBug() {
        for  (int osdonmyw = 0; osdonmyw < 0; osdonmyw++) {char ywweudve = 'g';}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}