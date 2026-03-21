class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        short rjdtqmog = -1324;
        this.finalize();
    
}
}