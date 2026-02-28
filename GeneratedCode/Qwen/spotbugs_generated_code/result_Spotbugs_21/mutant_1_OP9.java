class MathMinMaxBug {

    // Method to demonstrate the bug
    public int showBug(int value) {
        // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        return Math.min(0, Math.max(100, value)); 
    }

    public static void main(String[] args) {
        MathMinMaxBug bugDemo = new MathMinMaxBug();
        
        // Added do-while loop that does not affect the functionality
        int i = 0;
        do {
            System.out.println("Loop iteration: " + i);
            i++;
        } while (i < 0); // This loop will not execute because the condition is false

        System.out.println("Result with value 50: " + bugDemo.showBug(50));
        System.out.println("Result with value -10: " + bugDemo.showBug(-10));
        System.out.println("Result with value 150: " + bugDemo.showBug(150));
    }
}