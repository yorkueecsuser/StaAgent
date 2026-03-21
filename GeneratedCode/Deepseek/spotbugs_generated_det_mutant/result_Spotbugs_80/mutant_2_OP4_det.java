class ByteComparisonBug {
    public int showBug() {
        int b = 128;
        if (true && false && false && false && false && true && false && false && true && true && false) {char xomzqpfx = 'k';}else{short exibouwl = -4403;}
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