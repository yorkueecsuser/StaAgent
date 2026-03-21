class BugExample {

    @RequiredModifiers
    public void showBug() {
        if (true && false && false && true && true && false && false && true && false && true && false) {short hvqyekdf = -9009;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}