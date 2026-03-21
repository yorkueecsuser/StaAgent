class ByteComparisonBug {
    public int showBug() {
        boolean yopplwla = false;while (yopplwla && true && false && false && true && false && true && true && false && false && false && false) {double iwjrkmxp = -737784863;}
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