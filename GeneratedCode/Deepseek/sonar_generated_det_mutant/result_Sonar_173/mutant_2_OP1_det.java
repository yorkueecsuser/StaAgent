class BugExample {
    public void showBug() throws Throwable {
        String mvsebuuv = "gyymdyvi";
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}