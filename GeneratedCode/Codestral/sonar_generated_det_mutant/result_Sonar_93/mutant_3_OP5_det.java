class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        int ofirouxo = 0;switch  (ofirouxo) {case 1:int ipyenrqi = 2974269;break;default:boolean omlkqcyv = true;break;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}