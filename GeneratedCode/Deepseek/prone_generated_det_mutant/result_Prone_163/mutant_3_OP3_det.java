class BugExample {
    public void showBug() {
        if (false && false && true && false && true && true && false && true && true && false && false) {byte oakbojna = -99;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}