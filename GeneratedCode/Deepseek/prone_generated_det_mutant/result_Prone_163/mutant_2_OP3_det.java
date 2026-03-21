class BugExample {
    public void showBug() {
        if (true && true && true && true && false && true && false && true && false && false && false) {String njkppgcc = "rwryrifj";}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}