class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        // Mutant code
        String deadStoreMutant = "deadStore";
        // End of mutant code

        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug
    }
}