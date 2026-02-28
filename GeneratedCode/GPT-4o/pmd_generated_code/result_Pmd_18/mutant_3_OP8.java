class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        return k;
    }

    public int showBug_mutant() {
        int a = 012;  // Renamed variable: i -> a
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = a * j;
        return k;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);

        // Demonstrating the mutant method
        int mutantResult = example.showBug_mutant();
        System.out.println("Result of the mutant calculation: " + mutantResult);
    }
}