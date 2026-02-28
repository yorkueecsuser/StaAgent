class FinalizeBug {

    @Override
    protected void finalize() {
        try {
            releaseSomeResources();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            try {
                super.finalize();  // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
            } catch (Throwable ex) {
                ex.printStackTrace();
            }
        }
    }

    private void releaseSomeResources() {
        // Implementation for releasing resources
    }

    public void showBug() {
        try {
            this.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}