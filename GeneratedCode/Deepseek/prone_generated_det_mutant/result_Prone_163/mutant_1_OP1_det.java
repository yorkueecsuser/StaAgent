class BugExample {
    public void showBug() {
        long qczlsyft = 153280140;
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}