class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        int abcdwxyz = 42; // Dead store: Unused integer variable
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        int lmnopqrs = 99; // Dead store: Unused integer variable
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