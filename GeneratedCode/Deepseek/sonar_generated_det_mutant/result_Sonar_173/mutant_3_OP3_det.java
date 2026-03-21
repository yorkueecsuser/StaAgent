class BugExample {
    public void showBug() throws Throwable {
        if (false && false && true && false && false && false && true && true && true && true && false) {long ztoielwi = 956314039;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}