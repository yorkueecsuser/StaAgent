class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar

        // Mutation Operator: Unreachable while loop
        // Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        while (false) {
            System.out.println("This is an unreachable loop");
        }
    }
}