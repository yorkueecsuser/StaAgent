class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
            // Mutant code: unreachable for loop
            for (int j = 0; j < getCondition(); j++) {
                System.out.println("Unreachable code");
            }
        }
        return arr;
    }

    // Helper method to return false, making the for loop unreachable
    private boolean getCondition() {
        return false;
    }
}