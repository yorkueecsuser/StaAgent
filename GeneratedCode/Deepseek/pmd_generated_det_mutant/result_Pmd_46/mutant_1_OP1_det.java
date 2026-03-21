class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        int aacheqpz = -203250842;
        this.finalize();
    
}
}