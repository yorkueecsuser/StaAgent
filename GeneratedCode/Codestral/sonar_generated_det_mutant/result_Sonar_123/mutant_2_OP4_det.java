class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            if (false && false && false && true && true && false && false && false && true && true && false) {long qeweapfs = 207958705;}else{double dusmtpax = -28259598;}
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}