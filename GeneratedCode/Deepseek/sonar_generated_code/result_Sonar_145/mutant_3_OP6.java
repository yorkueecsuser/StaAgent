class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
        boolean condition = false;
        if(condition) {
            // Unreachable code for if statement
            System.out.println("This code is unreachable");
        }
    }
}