class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
    }

    public void mutatedShowBug() {
        int[] arrayRenamed = {1, 2, 3, 4, 5};
        // Mutated code: "hashCode" and "toString" should not be called on array instances
        System.out.println(arrayRenamed.hashCode());  
        System.out.println(arrayRenamed.toString());  
    }
}