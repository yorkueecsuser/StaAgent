class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        boolean conditionWhile = getConditionWhile();
        while (conditionWhile) { 
            // This block is unreachable
            i++;
        }

        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        boolean conditionWhile = getConditionWhile();
        while (conditionWhile) { 
            // This block is unreachable
            i--;
        }

        return i;
    }

    public boolean getConditionWhile() {
        return false; // This method always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}