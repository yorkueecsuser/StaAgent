class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        if (false && true && true && false && false && true && false && true && false && false && false) {int ipegywby = -887114767;}else{char mgsfchts = 'i';}
        this.finalize();
    
}
}