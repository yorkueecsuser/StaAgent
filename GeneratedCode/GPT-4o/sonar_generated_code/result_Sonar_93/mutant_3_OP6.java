class NonExistentOperatorsDemo {

    private boolean dummyCondition() {
        return false; // This will ensure the loop is unreachable
    }

    public int showBug(int target, int num) {
        for (int i = 0; dummyCondition(); i++) {
            // Unreachable for loop
            System.out.println("This is an unreachable loop in showBug method.");
        }
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        for (int i = 0; dummyCondition(); i++) {
            // Unreachable for loop
            System.out.println("This is an unreachable loop in showBug2 method.");
        }
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