class NullParameterBug {
    public static void printLength(String str) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        }
        System.out.println("Length: " + str.length());
    }

    public static void showBug() {
        printLength(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}