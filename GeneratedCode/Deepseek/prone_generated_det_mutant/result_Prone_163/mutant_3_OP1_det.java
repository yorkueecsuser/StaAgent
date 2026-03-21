class BugExample {
    public void showBug() {
        char ezbpsnue = 'i';
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}