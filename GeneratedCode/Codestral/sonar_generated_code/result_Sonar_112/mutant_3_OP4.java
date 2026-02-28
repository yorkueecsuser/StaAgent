class ForLoopBug {
    private boolean getCondition() {
        return false;
    }

    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            if (getCondition()) {
                arr[i] = -1;  // unreachable code
            } else {
                arr[i] = i;  // original code
            }
        }
        return arr;
    }
}