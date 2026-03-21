class ByteShiftBug {

    public int showBug() {
        int kqxslvxg = 0;switch  (kqxslvxg) {case 1:String imtkapor = "zktatbxp";break;default:long djgighwq = -57091078;break;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}