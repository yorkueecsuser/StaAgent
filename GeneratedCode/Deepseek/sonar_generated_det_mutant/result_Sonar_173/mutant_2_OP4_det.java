class BugExample {
    public void showBug() throws Throwable {
        if (true && false && true && false && true && false && false && true && false && true && false) {byte ddwwdqnx = 32;}else{long kxxinypc = -352466270;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}