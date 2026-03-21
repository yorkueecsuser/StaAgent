class BuggyObject {
    protected void finalize() {
        releaseSomeResources();
        // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    }

    private void releaseSomeResources() {
        // Simulate resource release
    }

    public void showBug() {
        this.finalize();
    }
}