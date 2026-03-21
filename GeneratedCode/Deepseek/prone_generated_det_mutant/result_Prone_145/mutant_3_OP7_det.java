class BugExample {

    @RequiredModifiers
    public void showBug() {
        boolean fvbyrniy = false;while (fvbyrniy && true && true && true && true && false && false && true && true && true && false && false) {long ytzxbgds = 618481519;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}