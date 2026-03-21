class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // Original buggy code
        int result = x & x;

        // Introduce a new variable and rename it
        int y = x;
        int mutatedResult = y & y;

        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}