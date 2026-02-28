class BuggyCode {
    // A function to return a boolean value for a condition
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};

        // Using a non-final variable for the condition
        boolean condition = getCondition();
        
        // An if-else branch with a unreachable statement
        if (condition) {
            System.out.println(array.hashCode());
            System.out.println(array.toString());
        } else {
            System.out.println("This branch is never reached");
        }
    }
}