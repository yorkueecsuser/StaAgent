class StringBuilderBug {
    public String showBug() {
        StringBuilder stringBuilder = new StringBuilder('A');
        StringBuilder a = stringBuilder; // Mutant: Renaming'stringBuilder' to 'a'
        return a.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}