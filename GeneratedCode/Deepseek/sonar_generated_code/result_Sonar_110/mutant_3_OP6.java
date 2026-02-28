class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug

        // Mutation Operator: Unreachable for loop
        boolean condition = false;
        if (condition) {
            int unreachable = 0;
        }
        for (int i = 0; condition; i++) {
            int unreachableLoop = 0;
        }
    }
}