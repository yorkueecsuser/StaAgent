class ThrowNullBug {
    public void showBug() {
        boolean vufoywjg = false;while (vufoywjg && true && false && false && true && true && false && false && true && false && true && false) {double uymmryfo = 808094700;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}