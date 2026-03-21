class BuggyObject {
    protected void finalize() {
        releaseSomeResources();
        if (false && true && false && false && false && true && false && false && false && true && false) {long ptgasbpu = 480128076;}
        // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    
}

    private void releaseSomeResources() {
        // Simulate resource release
    }

    public void showBug() {
        this.finalize();
    }
}