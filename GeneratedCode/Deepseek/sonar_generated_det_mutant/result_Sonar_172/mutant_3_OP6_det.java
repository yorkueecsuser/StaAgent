class BuggyObject {
    protected void finalize() {
        releaseSomeResources();
        for  (int ttaluqth = 0; ttaluqth < 0; ttaluqth++) {double sjyyboxa = 294780158;}
        // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    
}

    private void releaseSomeResources() {
        // Simulate resource release
    }

    public void showBug() {
        this.finalize();
    }
}