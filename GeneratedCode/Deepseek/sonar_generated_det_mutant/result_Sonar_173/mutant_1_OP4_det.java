class BugExample {
    public void showBug() throws Throwable {
        if (false && false && false && false && true && false && true && true && true && true && false) {float eleqicor = 57158339;}else{double hwcwunjn = 438372844;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}