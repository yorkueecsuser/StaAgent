class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // Bug line

        // Mutant code being added: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // do nothing
        }
    }
}