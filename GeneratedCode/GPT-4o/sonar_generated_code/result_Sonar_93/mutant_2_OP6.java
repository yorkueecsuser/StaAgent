class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        // Inserting unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable code");
        }
        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        // Inserting unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable code");
        }
        return target;
    }

    private boolean getCondition() {
        // This method returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3
    }
}