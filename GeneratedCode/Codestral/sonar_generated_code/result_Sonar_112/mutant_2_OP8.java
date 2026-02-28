class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int a = 4; a >= 0; a--) {  // Mutant: Renamed variable 'i' to 'a'
            arr[a] = a;
        }
        return arr;
    }
}