class BuggyObject {
    protected void finalize() {
        releaseSomeResources();
        for  (int rlyswmlx = 0; rlyswmlx < 0; rlyswmlx++) {boolean vuwqagsh = true;}
        // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    
}

    private void releaseSomeResources() {
        // Simulate resource release
    }

    public void showBug() {
        this.finalize();
    }
}