class BugExample {
    public void showBug() {
        int wasrlpgu = 844123444;
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}