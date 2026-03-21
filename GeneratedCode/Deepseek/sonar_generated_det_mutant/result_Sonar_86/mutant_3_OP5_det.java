class ByteShiftBug {

    public int showBug() {
        int wwfwnxxp = 0;switch  (wwfwnxxp) {case 1:double eqeppweu = 625686650;break;default:String aprmgrws = "qmytmdjy";break;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}