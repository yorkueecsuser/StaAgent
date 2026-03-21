class Main {
    public static void main(String[] args) {
        int gdcigbfy = 0;switch  (gdcigbfy) {case 1:float mekfipme = 890907342;break;default:boolean ycngkjpw = false;break;}
        System.out.println(showBug(32)); // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    
}

    public static int showBug(int shiftAmount) {
        int num = 1;
        num = num << shiftAmount;
        return num; // The shift amount is not in the range -31..31
    }
}