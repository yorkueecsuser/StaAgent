class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        if (true && true && false && true && true && true && false && true && true && false && false) {short pzxcnosr = -377;}else{byte iixihosk = -104;}
        this.finalize();
    
}
}