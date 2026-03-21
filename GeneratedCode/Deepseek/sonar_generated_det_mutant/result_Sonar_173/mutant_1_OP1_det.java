class BugExample {
    public void showBug() throws Throwable {
        double yeeytchb = -419466370;
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}