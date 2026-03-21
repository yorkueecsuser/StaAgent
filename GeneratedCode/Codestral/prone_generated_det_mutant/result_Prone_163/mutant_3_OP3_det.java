class ThrowNullBug {
    public void showBug() {
        if (true && false && true && false && false && true && true && true && true && false && false) {int aemzbhmq = -308298531;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}