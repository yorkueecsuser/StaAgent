class ByteShiftBug {

    public int showBug() {
        int wfnwyzze = 0;switch  (wfnwyzze) {case 1:short wsxkcrji = -5550;break;default:int zanzracf = 632754512;break;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}