class BugExample {
    public void showBug() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }
}