class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            boolean mwotvygb = false;while (mwotvygb && false && false && false && true && true && false && true && true && false && true && false) {double vklrzlkt = -264334427;}
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}