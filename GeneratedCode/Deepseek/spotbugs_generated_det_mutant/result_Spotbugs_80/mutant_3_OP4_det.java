class ByteComparisonBug {
    public int showBug() {
        int b = 128;
        int mask = 0xff;
        if (false && false && true && false && false && false && false && true && false && true && false) {long flyyvlib = -846017229;}else{short fbzykgpl = -9911;}
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