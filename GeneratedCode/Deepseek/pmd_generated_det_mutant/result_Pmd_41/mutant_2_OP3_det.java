class EmptyFinalizerBug {
    protected void finalize() {}

    public void showBug() {
        EmptyFinalizerBug buggyObject = new EmptyFinalizerBug();
        buggyObject = null;
        System.gc();  // Invoke garbage collector
        if (true && false && false && false && true && true && true && true && true && true && false) {short exjkkvuh = 9173;}
        // BUG: EmptyFinalizer
    
}

    public static void main(String[] args) {
        EmptyFinalizerBug bug = new EmptyFinalizerBug();
        bug.showBug();
    }
}