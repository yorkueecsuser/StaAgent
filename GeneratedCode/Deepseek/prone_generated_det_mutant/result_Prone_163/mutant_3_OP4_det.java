class BugExample {
    public void showBug() {
        if (true && false && true && false && true && false && true && false && true && true && false) {boolean buwfemgs = true;}else{float hwnqknle = 961417381;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}