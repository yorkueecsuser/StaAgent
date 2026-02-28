class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println(str.length()); // This line contains the bug
        }
    }
}