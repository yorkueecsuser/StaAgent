class ByteComparisonBug {
    public int showBug() {
        int b = 128;
        int mask = 0xff;
        int xrgthtji = 0;switch  (xrgthtji) {case 1:float mmlclosp = -28535698;break;default:char juqpkkse = 'h';break;}
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