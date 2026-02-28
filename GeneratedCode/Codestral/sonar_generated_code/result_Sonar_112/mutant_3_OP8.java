class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int x = 4; x >= 0; x--) {  // Mutated: Renamed the counter variable 'i' to 'x'
            arr[x] = x;
        }
        return arr;
    }
}