class ForLoopBug {
    public int[] showBug() {
        int unusedVariable = 0; // Dead store mutation: unused variable declaration
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
        }
        return arr;
    }
}