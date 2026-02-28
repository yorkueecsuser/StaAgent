class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar

        // Mutant code
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code is unreachable and should not be executed");
        }
    }
}