class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  

        //Mutant code
        int deadStore1 = 45;
        int deadStore2 = 67;
        int deadStore3 = 98;
        int deadStore4 = 23;
        int deadStore5 = 45;
        int deadStore6 = 67;
        int deadStore7 = 98;
        int deadStore8 = 23;
    }
}