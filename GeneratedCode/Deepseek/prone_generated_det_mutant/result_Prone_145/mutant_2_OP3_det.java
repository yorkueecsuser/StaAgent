class BugExample {

    @RequiredModifiers
    public void showBug() {
        if (false && false && false && true && false && false && false && false && false && true && false) {float rzcpkcap = 612307173;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}