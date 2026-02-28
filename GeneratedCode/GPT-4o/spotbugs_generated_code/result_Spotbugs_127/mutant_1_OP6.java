class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int j = 0; conditionFor; j++) {
            System.out.println("This code is unreachable");
        }

        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int k = 0; conditionFor; k++) {
            System.out.println("This code is unreachable");
        }

        return i;
    }

    public static boolean getConditionFor() {
        return false;
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}