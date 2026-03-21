class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            boolean defnffcq = false;while (defnffcq && true && true && false && true && false && false && true && true && false && true && false) {char spitmymi = 'f';}
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}