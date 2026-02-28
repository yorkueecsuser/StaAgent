class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        return k;
    }

    // Mutant method with renamed variables
    public int showBugMutant() {
        int x = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = x * j;
        return k;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);

        // Using mutant method
        int mutantResult = example.showBugMutant();
        System.out.println("Result of the mutant calculation: " + mutantResult);
    }
}