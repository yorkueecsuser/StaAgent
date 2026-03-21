class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        for  (int fxzbjyxh = 0; fxzbjyxh < 0; fxzbjyxh++) {float bwbkscho = -485769483;}
        this.finalize();
    
}
}