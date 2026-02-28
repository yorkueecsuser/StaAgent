class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
            // Mutant: Unreachable switch statement
            boolean condition = getCondition();
            if (condition) {
                int value = 0;
                switch(value) { // This switch statement is unreachable because value is always 0
                    case 1:
                        System.out.println("This will never be printed");
                        break;
                    default:
                        break;
                }
            }
        }
        return arr;
    }

    // Helper method to return a dynamically determined boolean condition
    private boolean getCondition() {
        return false; // This ensures the condition is always false
    }
}