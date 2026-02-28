class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  

        // ADDED MUTATION: Unreachable switch statement
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            switch (new Integer(1)) {
                case 1:
                    System.out.println("This switch statement should never be reached.");
                    break;
                default:
                    break;
            }
        }
    }
}