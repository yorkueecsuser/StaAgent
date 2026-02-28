class ForLoopBug {
    public boolean alwaysFalse() {
        return false;
    }

    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            if (alwaysFalse()) {  // Mutant: Unreachable if statement
                arr[i] = -1;
            }
            arr[i] = i;
        }
        return arr;
    }
}