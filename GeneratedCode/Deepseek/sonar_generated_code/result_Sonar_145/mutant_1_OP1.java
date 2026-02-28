class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
        
        // Mutation Operator: Dead Store
        // Inserting unused variable declarations with one primitive type (for example string, int) to a randomly selected basic book in the program. The name of the variable is a string of eight characters randomly generated in the form of [a-z]. Only one dead store is added in each transformation by this operator.
        int aaaaaaaa; // An unused integer variable declaration
    }
}