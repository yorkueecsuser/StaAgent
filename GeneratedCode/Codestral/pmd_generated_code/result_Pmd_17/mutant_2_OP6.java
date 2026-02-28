class MultipleUnaryOperatorsBug {
    private boolean getFalse() {
        return false;
    }

    public int showBug() {
        int i = - -1;

        // Mutated code: Insert unreachable for loop
        boolean conditionFor = getFalse();
        for (int j = 0; conditionFor; j++) {
            System.out.println("This is an unreachable loop.");
        }

        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}