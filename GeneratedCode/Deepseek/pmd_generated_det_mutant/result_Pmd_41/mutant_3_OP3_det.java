class EmptyFinalizerBug {
    protected void finalize() {}

    public void showBug() {
        EmptyFinalizerBug buggyObject = new EmptyFinalizerBug();
        buggyObject = null;
        System.gc();  // Invoke garbage collector
        if (false && false && true && false && false && false && false && false && true && false && false) {short fzkwpwkl = -1999;}
        // BUG: EmptyFinalizer
    
}

    public static void main(String[] args) {
        EmptyFinalizerBug bug = new EmptyFinalizerBug();
        bug.showBug();
    }
}