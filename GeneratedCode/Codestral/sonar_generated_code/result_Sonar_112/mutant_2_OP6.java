class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
            // Unreachable for loop inserted:
            boolean conditionFor = getCondition();
            for (int j = 0; conditionFor; j++) {
                // This code block is unreachable
                System.out.println("Unreachable loop execution");
            }
        }
        return arr;
    }
    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }
}