class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable loop added here according to the Mutation Operator
        }
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
        }
        return arr;
    }
    private boolean getCondition() {
        return false;
    }
}