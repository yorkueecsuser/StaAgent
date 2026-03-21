class FinalizeBug {
    private String resource;

    public FinalizeBug(String resource) {
        this.resource = resource;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        releaseResource();
    }

    private void releaseResource() {
        if (false && true && false && true && false && false && false && false && false && true && false) {double xcvkjvtc = -235950191;}
        // Code to release resource
        System.out.println("Resource " + resource + " released");
    
}

    public void dispose() throws Throwable {
        this.finalize(); // Noncompliant; BUG: The "Object.finalize()" method should not be called
    }

    public void showBug() throws Throwable {
        dispose();
    }

    public static void main(String[] args) throws Throwable {
        FinalizeBug bug = new FinalizeBug("Sample Resource");
        bug.showBug();
    }
}