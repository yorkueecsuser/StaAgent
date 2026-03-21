class ByteComparisonBug {
    public int showBug() {
        int b = 128;
        if (false && false && true && true && true && false && true && false && false && true && false) {char kisjiybg = 'g';}
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