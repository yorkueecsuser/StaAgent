class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            byte rxjvkecc = -91;
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}