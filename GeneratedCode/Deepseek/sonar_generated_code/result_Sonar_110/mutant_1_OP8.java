class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug
    }

    public static void showMutant(){
        String renamed = null;
        // Mutant code
        System.out.println(renamed.length()); // Mutated line
    }
}