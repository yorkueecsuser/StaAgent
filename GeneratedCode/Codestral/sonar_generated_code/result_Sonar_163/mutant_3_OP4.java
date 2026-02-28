class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');

        // Mutant code: Unreachable if-else statement
        boolean isTrue = false;
        if (isTrue) {
            int x = 10;
            x = x / 0; // This line will cause a division by zero error, but it's unreachable so it won't be executed
        } else {
            // This else block is also unreachable
            System.out.println("This block is unreachable!");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}