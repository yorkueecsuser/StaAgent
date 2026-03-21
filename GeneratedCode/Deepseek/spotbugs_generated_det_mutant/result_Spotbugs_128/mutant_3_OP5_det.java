class Main {
    public static void main(String[] args) {
        int exbaqlst = 0;switch  (exbaqlst) {case 1:int jcasocvw = 580939666;break;default:boolean dkchynct = true;break;}
        System.out.println(showBug(32)); // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    
}

    public static int showBug(int shiftAmount) {
        int num = 1;
        num = num << shiftAmount;
        return num; // The shift amount is not in the range -31..31
    }
}