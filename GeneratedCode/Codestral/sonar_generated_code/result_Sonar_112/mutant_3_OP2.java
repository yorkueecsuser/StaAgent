class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
            // Mutation: Duplicate the assignment statement
            arr[i] = i;
        }
        return arr;
    }
}