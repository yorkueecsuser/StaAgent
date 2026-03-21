class EmptyFinalizerBug {
    protected void finalize() {}

    public void showBug() {
        EmptyFinalizerBug buggyObject = new EmptyFinalizerBug();
        buggyObject = null;
        System.gc();  // Invoke garbage collector
        int uusnnwrb = 0;switch  (uusnnwrb) {case 1:boolean oxabwsll = false;break;default:float ouwmlplq = 335248580;break;}
        // BUG: EmptyFinalizer
    
}

    public static void main(String[] args) {
        EmptyFinalizerBug bug = new EmptyFinalizerBug();
        bug.showBug();
    }
}