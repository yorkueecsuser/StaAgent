class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        do { // Noncompliant; b never written to in loop
            k++;
            // BUG: Loops should not be infinite
        } while (b);
    }

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}