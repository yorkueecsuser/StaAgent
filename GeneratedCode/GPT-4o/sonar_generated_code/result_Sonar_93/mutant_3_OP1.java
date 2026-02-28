class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        int fkdwejqr = 0; // Dead store - unused variable with a random name
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        int xbqzpljh = 0; // Dead store - unused variable with a random name
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3
    }
}