class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int j = 4; j >= 0; j--) {  // Mutant: Renamed 'i' to 'j'
            arr[j] = j;
        }
        return arr;
    }

    // Original code left in place
    public int[] originalCode() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
        }
        return arr;
    }
}