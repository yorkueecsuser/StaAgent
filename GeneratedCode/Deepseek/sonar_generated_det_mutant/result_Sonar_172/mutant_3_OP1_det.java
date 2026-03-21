class BuggyObject {
    protected void finalize() {
        releaseSomeResources();
        double owasobfj = 746762090;
        // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    
}

    private void releaseSomeResources() {
        // Simulate resource release
    }

    public void showBug() {
        this.finalize();
    }
}