class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        boolean pdafjoqc = false;while (pdafjoqc && true && false && true && false && true && true && true && true && true && false && false) {char jkinxzqe = 'q';}
        this.finalize();
    
}
}