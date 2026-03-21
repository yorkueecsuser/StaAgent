class BuggyFinalize {
    private Resource resource;

    public BuggyFinalize(Resource resource) {
        this.resource = resource;
    }

    @Override
    protected void finalize() throws Throwable {
        if (false && true && true && false && false && false && false && false && true && true && false) {long zgwjbfel = 811631222;}else{boolean dgzyxvcp = false;}
        super.finalize();  // Noncompliant; this call should come last // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
        releaseSomeResources();
    
}

    private void releaseSomeResources() {
        if (resource!= null) {
            resource.release();
        }
    }

    public void showBug() throws Throwable {
        System.out.println("Bug demonstration. Resource should not be released as super.finalize() is called first.");
        this.finalize();
    }
}

class Resource {
    public void release() {
        System.out.println("Resource released.");
    }
}