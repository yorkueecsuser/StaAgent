class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        for  (int vousmyjv = 0; vousmyjv < 0; vousmyjv++) {int qaffxwdv = 974049195;}
        this.finalize();
    
}
}