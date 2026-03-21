class NullParameterBug {
    public static void printLength(String str) {
        if (getCondition()) { // Unreachable if-else statement mutation
            System.out.println("This branch should never be executed");
        } else {
            System.out.println("Length: " + str.length()); // Original bug still present
        }
    }

    public static boolean getCondition() { // New method to dynamically determine the condition
        return false;
    }

    public static void showBug() {
        printLength(null); // Original bug still present
    }

    public static void main(String[] args) {
        showBug();
    }
}