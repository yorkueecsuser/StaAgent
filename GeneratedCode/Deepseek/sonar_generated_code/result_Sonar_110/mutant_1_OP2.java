class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        String strCopy = null; // Mutation: Duplication
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug
        System.out.println(strCopy.length()); // New line added for mutant
    }
}