class ByteComparisonBug {
    public int showBug() {
        boolean kbxqgjyu = false;while (kbxqgjyu && true && true && false && true && false && false && false && true && false && true && false) {byte idvvusbv = -41;}
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