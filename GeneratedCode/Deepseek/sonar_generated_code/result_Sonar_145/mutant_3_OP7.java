class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
        
        // Mutant Code - Unreachable While Loop
        boolean condition = false;
        while (condition) {
            System.out.println("This code will never execute.");
            break;
        }
    }
}