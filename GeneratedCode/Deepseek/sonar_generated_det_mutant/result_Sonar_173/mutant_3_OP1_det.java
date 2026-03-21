class BugExample {
    public void showBug() throws Throwable {
        byte shatijid = -54;
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}