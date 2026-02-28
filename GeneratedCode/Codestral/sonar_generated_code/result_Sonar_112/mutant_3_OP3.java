class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
            boolean unreachableCondition = falseCondition(); // Added unreachable if statement
            if (unreachableCondition) {
                System.out.println("This line should never be executed.");
            }
        }
        return arr;
    }

    private boolean falseCondition() { // Method to dynamically return false
        return false;
    }
}