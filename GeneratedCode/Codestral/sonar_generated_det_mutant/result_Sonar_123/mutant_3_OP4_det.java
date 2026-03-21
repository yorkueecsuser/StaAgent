class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            if (false && false && false && false && false && false && false && false && false && true && false) {String euaqdfmv = "rumzymjh";}else{String llvzeqfi = "iyjqbjse";}
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}