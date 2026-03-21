class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        if (false && false && true && false && true && true && true && true && true && true && false) {short yypjpbls = 5262;}
        this.finalize();
    
}
}