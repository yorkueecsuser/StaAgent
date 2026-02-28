class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // Original bug
        int result = x & x;

        // Mutated code
        int y = x;
        int mutantResult = y & y;

        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}