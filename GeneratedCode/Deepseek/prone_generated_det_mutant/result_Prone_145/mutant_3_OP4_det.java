class BugExample {

    @RequiredModifiers
    public void showBug() {
        if (false && true && false && false && true && false && true && false && false && true && false) {short eoiswwxi = 8740;}else{float ugoeievo = 311453439;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}