class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        int dntoxdpg = 0;switch  (dntoxdpg) {case 1:double zkpwndru = 658407536;break;default:double zpidridh = -313417007;break;}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}