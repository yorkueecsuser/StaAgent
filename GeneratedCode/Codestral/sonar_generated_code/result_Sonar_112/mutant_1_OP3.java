class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable if statement");
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