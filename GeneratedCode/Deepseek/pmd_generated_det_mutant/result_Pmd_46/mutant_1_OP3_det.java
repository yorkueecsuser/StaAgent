class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        if (true && false && false && false && true && true && false && true && false && false && false) {String ufuvilcz = "qtfhjaey";}
        this.finalize();
    
}
}