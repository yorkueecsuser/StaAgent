class ForLoopBug {
    public boolean getCondition() {
        return false;
    }

    public int[] showBug() {
        int[] arr = new int[5];

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }

        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
        }
        return arr;
    }
}