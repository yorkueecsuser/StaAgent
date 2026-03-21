class BugExample {

    @RequiredModifiers
    public void showBug() {
        if (false && true && false && true && false && false && false && false && false && false && false) {char xsrenude = 'w';}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}