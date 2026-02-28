class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        StringBuilder sbDuplicate = new StringBuilder('A'); // Mutant: Duplicate the assignment statement
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}