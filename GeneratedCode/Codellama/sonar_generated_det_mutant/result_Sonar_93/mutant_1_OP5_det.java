class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        int etjrmzwe = 0;switch  (etjrmzwe) {case 1:byte afyjhgpz = 44;break;default:byte rtuqtlhd = 9;break;}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}