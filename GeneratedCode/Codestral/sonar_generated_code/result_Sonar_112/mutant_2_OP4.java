class ForLoopBug {
    private boolean getCondition() {
        return false;
    }

    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
            // Inserting unreachable if-else block
            if (getCondition()) {
                // This code will never be executed
                int x = 10 / 0;
            } else {
                // This code will always be executed
                arr[i] *= 2;
            }
        }
        return arr;
    }
}