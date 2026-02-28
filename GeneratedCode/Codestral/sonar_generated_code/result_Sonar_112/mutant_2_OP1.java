class ForLoopBug {
    public int[] showBug() {
        int deadStoreVariable;  // Dead Store: Unused variable
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
        }
        return arr;
    }
}