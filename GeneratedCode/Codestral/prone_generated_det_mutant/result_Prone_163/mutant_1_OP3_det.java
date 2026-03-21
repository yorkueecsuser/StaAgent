class ThrowNullBug {
    public void showBug() {
        if (true && false && false && false && true && true && false && true && true && false && false) {float nksgnzyb = 658198890;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}