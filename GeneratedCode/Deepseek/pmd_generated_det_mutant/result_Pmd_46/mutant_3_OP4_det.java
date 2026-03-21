class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        if (true && true && false && true && false && false && false && true && false && true && false) {int ythqxrba = 813150923;}else{boolean ahzkbueh = false;}
        this.finalize();
    
}
}