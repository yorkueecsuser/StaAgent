class FinalizeBug {
    private String resource;

    public FinalizeBug(String resource) {
        this.resource = resource;
        System.out.println("Resource acquired: " + resource);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Resource released: " + resource);
        resource = null;
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public void showBug() throws Throwable {
        dispose();
    }
}