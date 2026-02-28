class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
            arr[i] = i; // Mutant: Duplicated assignment
        }
        return arr;
    }
}