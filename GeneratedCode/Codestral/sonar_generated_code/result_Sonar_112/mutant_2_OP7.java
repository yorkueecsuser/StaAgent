class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
        }
        boolean conditionWhile = getCondition(); // This method should return false for the loop to be unreachable
        while (conditionWhile) {
            System.out.println("This is an unreachable loop");
        }
        return arr;
    }

    // A method to return the condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}