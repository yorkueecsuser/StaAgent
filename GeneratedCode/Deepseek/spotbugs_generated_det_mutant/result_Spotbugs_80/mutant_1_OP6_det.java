class ByteComparisonBug {
    public int showBug() {
        int b = 128;
        int mask = 0xff;
        for  (int yxesofzn = 0; yxesofzn < 0; yxesofzn++) {float vplwndqp = -992052346;}
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