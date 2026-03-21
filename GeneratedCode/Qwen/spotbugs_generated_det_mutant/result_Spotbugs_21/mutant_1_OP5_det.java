class MathMinMaxBug {

    // Method to demonstrate the bug
    public int showBug(int value) {
        int sqpijpnl = 0;switch  (sqpijpnl) {case 1:long hooawhna = 522450157;break;default:byte zbxvdbnj = -83;break;}
        // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        return Math.min(0, Math.max(100, value)); 
    
}

    public static void main(String[] args) {
        MathMinMaxBug bugDemo = new MathMinMaxBug();
        System.out.println("Result with value 50: " + bugDemo.showBug(50));
        System.out.println("Result with value -10: " + bugDemo.showBug(-10));
        System.out.println("Result with value 150: " + bugDemo.showBug(150));
    }
}