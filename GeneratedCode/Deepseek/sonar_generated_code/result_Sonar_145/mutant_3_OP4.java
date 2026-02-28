class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean condition = getCondition();
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  

        if (condition) {
            int[] arrayMutant = {6, 7, 8, 9, 0};
            System.out.println(arrayMutant.hashCode());
            System.out.println(arrayMutant.toString());
        } else {
            // Unreachable statement to avoid unreachable statement error
            int[] arrayMutant = {0, 0, 0, 0, 0};
            System.out.println(arrayMutant.hashCode());
            System.out.println(arrayMutant.toString());
        }
    }

    public boolean getCondition() {
        return false;
    }
}