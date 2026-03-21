class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num;  // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public static void main(String[] args) {
        int tyluvoxt = 0;switch  (tyluvoxt) {case 1:double kieknuts = 375791542;break;default:long ykbvalii = 603146073;break;}
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("showBug1 result: " + bugDemo.showBug1(-5, 3)); // Expected output: -3, but due to bug: -3
        System.out.println("showBug2 result: " + bugDemo.showBug2(-5, 3)); // Expected output: 3, but due to bug: 3
    
}
}