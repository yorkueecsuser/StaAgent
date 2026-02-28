class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {  // BUG: The counter moves away from the end of the specified range
            arr[i] = i;
        }
        return arr;
    }
}