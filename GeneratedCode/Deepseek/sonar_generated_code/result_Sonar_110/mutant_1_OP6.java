class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            /* code */
        }
    }

    public static boolean getCondition() {
        return false; // This will make the for loop unreachable
    }
}