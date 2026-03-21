class BuggyObject {
    protected void finalize() {
        releaseSomeResources();
        for  (int xlztliuv = 0; xlztliuv < 0; xlztliuv++) {float oxgiebnm = -741248941;}
        // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    
}

    private void releaseSomeResources() {
        // Simulate resource release
    }

    public void showBug() {
        this.finalize();
    }
}