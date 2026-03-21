class ByteComparisonBug {
    public int showBug() {
        int b = 128;
        int mask = 0xff;
        if (false && false && false && true && false && true && false && false && true && false && false) {char ekengxbi = 'z';}
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