class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug1Mutant(int a, int b) {
        a =+ b; // BUG: Non-existent operators like "=+" should not be used
        return a;
    }

    public int showBug2(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2Mutant(int x, int y) {
        x =- y; // BUG: Non-existent operators like "=+" should not be used
        return x;
    }

    public static void main(String[] args) {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("Result of showBug1: " + bugDemo.showBug1(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug1Mutant: " + bugDemo.showBug1Mutant(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug2: " + bugDemo.showBug2(-5, 3)); // Expected output: -3
        System.out.println("Result of showBug2Mutant: " + bugDemo.showBug2Mutant(-5, 3)); // Expected output: -3
    }
}