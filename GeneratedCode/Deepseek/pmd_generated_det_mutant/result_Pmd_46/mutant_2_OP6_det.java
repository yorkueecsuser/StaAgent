class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        for  (int qocsihrm = 0; qocsihrm < 0; qocsihrm++) {byte cdtgsoyc = -55;}
        this.finalize();
    
}
}