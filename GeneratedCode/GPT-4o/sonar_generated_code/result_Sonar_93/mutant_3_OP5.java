class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used

        int unreachableSwitchCondition = 0; // Use a variable to ensure runtime evaluation
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This switch case is unreachable");
                break;
            default:
                break;
        }

        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        int unreachableSwitchCondition = 0; // Use a variable to ensure runtime evaluation
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This switch case is unreachable");
                break;
            default:
                break;
        }

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