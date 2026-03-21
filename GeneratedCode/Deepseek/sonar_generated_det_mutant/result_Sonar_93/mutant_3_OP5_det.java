class BugExample {
    public int showBug1() {
        int target = -5;
        int upnytivr = 0;switch  (upnytivr) {case 1:String fbbfwuxy = "jbreqbmz";break;default:short wufojnsy = 1898;break;}
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        return target;
    
}
    
    public int showBug2() {
        int target = -5;
        int num = 3;

        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }
}