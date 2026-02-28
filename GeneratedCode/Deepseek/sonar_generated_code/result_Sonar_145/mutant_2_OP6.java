class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString()); 
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is a mutant for the unreachable for loop mutation operator");
        }
    }
}