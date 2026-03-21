class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        int wfdlcstq = 0;switch  (wfdlcstq) {case 1:float qruajuse = -583512675;break;default:char gsrnqunm = 'g';break;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}