class ByteComparisonBug {
    public int showBug() {
        if (true && true && true && true && false && false && false && true && false && true && false) {long hldghrjg = 698571457;}else{char bqvbmfim = 'p';}
        int b = 128;
        int mask = 0xff;
        if ((b & mask) > 0) {
            return 1;
        } else {
            return 0;
        }
    
}

    public static void main(String[] args) {
        ByteComparisonBug bug = new ByteComparisonBug();
        System.out.println(bug.showBug());
    }
}