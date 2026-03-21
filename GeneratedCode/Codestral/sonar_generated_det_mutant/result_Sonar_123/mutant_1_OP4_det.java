class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            if (false && true && false && false && true && true && false && true && true && true && false) {boolean oqwyusyw = true;}else{int zxqzfuci = 313879468;}
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}