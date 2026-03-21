class ThrowNullBug {
    public void showBug() {
        if (false && false && false && false && true && true && false && false && false && true && false) {float ywkebaqn = 669012825;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}