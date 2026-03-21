class EmptyFinalizerBug {
    protected void finalize() {}

    public void showBug() {
        EmptyFinalizerBug buggyObject = new EmptyFinalizerBug();
        buggyObject = null;
        System.gc();  // Invoke garbage collector
        // BUG: EmptyFinalizer
    }
public static void main(String [] args){
    EmptyFinalizerBug bug = new EmptyFinalizerBug();
    bug = new EmptyFinalizerBug();
    bug.showBug();
}
}