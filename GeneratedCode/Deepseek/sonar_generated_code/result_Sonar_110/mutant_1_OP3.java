class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        // Mutation: We are going to add an 'if' statement to the code that is always false, making it unreachable.
        boolean condition = getCondition();
        if (condition) {
            System.out.println(str.length()); // This line contains the bug
        }
    }

    public static boolean getCondition() {
        // This method is used to generate a non-final condition in the 'if' statement, making it unreachable.
        return false;
    }
}