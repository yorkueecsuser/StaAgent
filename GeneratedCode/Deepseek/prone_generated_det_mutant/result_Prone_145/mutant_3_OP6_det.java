class BugExample {

    @RequiredModifiers
    public void showBug() {
        for  (int zmkilnkc = 0; zmkilnkc < 0; zmkilnkc++) {short cjloweel = 3738;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}