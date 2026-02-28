class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        return k;
    }

    // Mutated version of the showBug method with renamed variable
    public int showBugMutant() {
        int a = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = a * j;
        return k;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
        
        // Using the mutated method
        int mutantResult = example.showBugMutant();
        System.out.println("Result of the mutated calculation: " + mutantResult);
    }
}