class MathMinMaxBug {

    // Method to demonstrate the bug
    public int showBug(int value) {
        // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        return Math.min(0, Math.max(100, value)); 
    }

    public static void main(String[] args) {
        MathMinMaxBug bugDemo = new MathMinMaxBug();
        int x = 50;
        int y = -10;
        int z = 150;
        System.out.println("Result with value " + x + ": " + bugDemo.showBug(x));
        System.out.println("Result with value " + y + ": " + bugDemo.showBug(y));
        System.out.println("Result with value " + z + ": " + bugDemo.showBug(z));
    }
}