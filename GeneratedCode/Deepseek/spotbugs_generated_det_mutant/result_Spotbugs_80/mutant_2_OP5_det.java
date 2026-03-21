class ByteComparisonBug {
    public int showBug() {
        int b = 128;
        int qhdldzxb = 0;switch  (qhdldzxb) {case 1:double dotbeohm = -957242247;break;default:short mynhljef = -4238;break;}
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