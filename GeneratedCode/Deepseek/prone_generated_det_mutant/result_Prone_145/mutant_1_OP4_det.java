class BugExample {

    @RequiredModifiers
    public void showBug() {
        if (true && true && true && true && false && true && true && true && true && true && false) {char xswcezpf = 'l';}else{int dlcjnnto = 668582714;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}