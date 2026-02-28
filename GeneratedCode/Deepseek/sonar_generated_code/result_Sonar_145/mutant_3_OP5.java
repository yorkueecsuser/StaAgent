class BuggyCode {
    boolean condition = true;
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
        if (condition) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This is a mutant code"); // Added unreachable code
                    break;
                default:
                    break;
            }
        }
    }
    public boolean getCondition() {
        return condition;
    }
}