class BuggyFinalize {
    private Resource resource;

    public BuggyFinalize(Resource resource) {
        this.resource = resource;
    }

    @Override
    protected void finalize() throws Throwable {
        int woqgcypl = 0;switch  (woqgcypl) {case 1:String pbgmtjba = "zslksahl";break;default:int fprayobi = -666836301;break;}
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