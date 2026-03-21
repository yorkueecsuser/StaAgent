class EmptyFinalizerBug {
    protected void finalize() {}

    public void showBug() {
        EmptyFinalizerBug buggyObject = new EmptyFinalizerBug();
        buggyObject = null;
        System.gc();  // Invoke garbage collector
        boolean fpontxxv = false;while (fpontxxv && false && true && true && false && false && false && true && true && false && false && false) {float yseyhgaj = 388377458;}
        // BUG: EmptyFinalizer
    
}

    public static void main(String[] args) {
        EmptyFinalizerBug bug = new EmptyFinalizerBug();
        bug.showBug();
    }
}