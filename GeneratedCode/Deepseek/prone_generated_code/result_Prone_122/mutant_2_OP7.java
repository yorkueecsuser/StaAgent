class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());

        // Mutation Operator: Unreachable while loop
        // Generating an unreachable while loop to ensure it does not affect the original code
        // This should be a unique mutation, not a generic one
        boolean mutantFlag = false;
        while (mutantFlag) {
            System.out.println("This is a mutant code, it will not be executed");
        }
    }
}