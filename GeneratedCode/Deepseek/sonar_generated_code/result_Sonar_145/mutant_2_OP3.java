class BuggyCode {
    boolean condition;

    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  

        // Mutant code
        if (condition) {
            System.out.println(array.hashCode());  
            System.out.println(array.toString());  
        }
    }
}