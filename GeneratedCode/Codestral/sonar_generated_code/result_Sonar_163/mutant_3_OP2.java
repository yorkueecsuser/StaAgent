class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        StringBuilder sbMutant = new StringBuilder('A'); // Mutant: Duplication of the assignment statement
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}