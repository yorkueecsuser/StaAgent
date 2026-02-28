class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};

        // MUTANT: Unreachable while loop
        boolean condition = false;
        while (condition) {
            System.out.println("Unreachable code");
            condition = true;
        }

        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
    }
}