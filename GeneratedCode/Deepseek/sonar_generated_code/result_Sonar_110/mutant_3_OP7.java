class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug
        
        // Mutation Operator: Adding an unreachable while loop
        boolean condition = false;
        while (condition) {
            // Adding some dummy code to make the while loop unreachable
            int x = 10;
            x = x + 1;
        }
    }
}