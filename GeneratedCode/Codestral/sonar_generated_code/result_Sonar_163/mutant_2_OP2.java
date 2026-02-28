class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A'); // Original code
        StringBuilder sbDuplicate = new StringBuilder('A'); // Mutated code
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}