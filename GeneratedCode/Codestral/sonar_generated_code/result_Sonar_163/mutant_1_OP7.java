class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        boolean unreachableCondition = false;
        while (unreachableCondition) { // Mutant: Unreachable while loop
            System.out.println("This code will never be executed");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}