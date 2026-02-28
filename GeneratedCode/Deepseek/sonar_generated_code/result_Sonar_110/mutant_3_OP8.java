class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // MUTANT: Renaming variable'str' to 'abc'
        String abc = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(abc.length()); // This line contains the bug
    }
}