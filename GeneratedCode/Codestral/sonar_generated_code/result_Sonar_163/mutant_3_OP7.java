class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');

        // Mutant code: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This line should never be executed");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}