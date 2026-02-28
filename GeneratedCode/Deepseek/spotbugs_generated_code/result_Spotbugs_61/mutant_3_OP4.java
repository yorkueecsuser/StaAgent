class NullParameterBug {
    public static void printLength(String str) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch");
        } else {
            System.out.println("Length: " + str.length()); // Original bug remains
        }
    }

    public static void showBug() {
        printLength(null); // Original bug remains
    }

    public static void main(String[] args) {
        showBug();
    }
}