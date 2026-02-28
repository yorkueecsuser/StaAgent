class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];

        boolean loopCondition = false;
        for (int i = 4; loopCondition; i--) {  // Mutant: Unreachable for loop
            arr[i] = i;
        }

        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
        }
        return arr;
    }
}