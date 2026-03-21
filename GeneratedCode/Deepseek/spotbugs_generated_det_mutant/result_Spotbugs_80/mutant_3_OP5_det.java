class ByteComparisonBug {
    public int showBug() {
        int bcjdghjd = 0;switch  (bcjdghjd) {case 1:short ppfrxjpv = -1187;break;default:float dmjjelsd = -364828163;break;}
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