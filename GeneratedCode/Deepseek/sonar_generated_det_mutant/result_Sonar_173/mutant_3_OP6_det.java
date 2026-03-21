class BugExample {
    public void showBug() throws Throwable {
        for  (int lrubzhwr = 0; lrubzhwr < 0; lrubzhwr++) {char krbnbthz = 'a';}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}