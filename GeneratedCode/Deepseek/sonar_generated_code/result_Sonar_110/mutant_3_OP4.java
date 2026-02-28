class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug

        // Adding an unreachable if-else statement
        boolean shouldNotRun = true;
        if (shouldNotRun) {
            System.out.println("This line should not execute");
        } else {
            System.out.println("This line will execute");
        }
    }
}