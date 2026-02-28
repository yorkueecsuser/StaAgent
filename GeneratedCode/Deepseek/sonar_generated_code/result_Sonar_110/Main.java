class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug
        
        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable for loop");
        }
    }
}