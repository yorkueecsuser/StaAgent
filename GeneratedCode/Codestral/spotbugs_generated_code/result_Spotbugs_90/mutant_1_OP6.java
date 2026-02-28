class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // Insert unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line should never be printed");
        }

        // Original buggy code
        int result = x & x;
        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}