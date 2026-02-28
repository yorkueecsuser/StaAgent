class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // Duplicated code
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
        // Original code
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
    }
}