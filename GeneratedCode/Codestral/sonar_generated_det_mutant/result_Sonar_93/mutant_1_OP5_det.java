class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        int wzrfvpiq = 0;switch  (wzrfvpiq) {case 1:byte ynotdkld = -105;break;default:long mwuowzkh = -845492432;break;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}