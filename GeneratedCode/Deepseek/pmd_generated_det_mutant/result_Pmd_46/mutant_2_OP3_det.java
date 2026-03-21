class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        if (true && true && true && true && false && false && true && true && true && true && false) {boolean qsbquqis = true;}
        this.finalize();
    
}
}