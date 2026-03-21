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
        int jzctmqsu = 0;switch  (jzctmqsu) {case 1:String zdxrmaps = "bzrwncao";break;default:long reuaickz = 233326150;break;}
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