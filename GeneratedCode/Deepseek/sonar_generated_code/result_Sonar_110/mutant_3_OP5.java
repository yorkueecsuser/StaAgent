class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug

        boolean condition = getCondition();
        switch (getValue()) {
            default:
                if(condition) {
                    // Unreachable code
                    System.out.println("Unreachable");
                }
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }
}