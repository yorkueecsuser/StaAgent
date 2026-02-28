class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        String deadStore = "deadStore";
        System.out.println(str.length()); // This line contains the bug
    }
}