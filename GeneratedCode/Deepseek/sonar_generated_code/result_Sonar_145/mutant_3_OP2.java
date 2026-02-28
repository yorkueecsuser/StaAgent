class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  

        // Mutant 1 - Duplication Operator
        System.out.println(array.hashCode());  

        // Mutant 2 - Duplication Operator with modification
        System.out.println(array);  
    }
}