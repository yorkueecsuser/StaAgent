class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
    }
}

class MutantCode {
    public void showMutant() {
        int[] abc = {1, 2, 3, 4, 5};
        // MUTANT: "hashCode" and "toString" should not be called on array instances
        // Mutant code here:
        System.out.println(abc.hashCode());  
        System.out.println(abc.toString());  
    }
}