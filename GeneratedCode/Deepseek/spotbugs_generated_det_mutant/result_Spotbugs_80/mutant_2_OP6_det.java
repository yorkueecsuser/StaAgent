class ByteComparisonBug {
    public int showBug() {
        int b = 128;
        int mask = 0xff;
        for  (int ungbxftz = 0; ungbxftz < 0; ungbxftz++) {byte gzmotndz = -106;}
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