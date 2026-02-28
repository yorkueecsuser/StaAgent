class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());
        // Mutant code
        boolean condition = false;
        switch (condition) {
            case true:
                int unreachable = 10;
                break;
            case false:
                break;
        }
    }
}