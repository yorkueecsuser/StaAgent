class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug

        // The mutated code below is a while loop which is guaranteed to never execute
        boolean falseCondition = false;
        while (falseCondition) {
            // Inserted mutant code
            int mutantCode = 0;
            mutantCode++;
        }
    }
}