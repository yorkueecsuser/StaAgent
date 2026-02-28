class StringBuilderBug {
    public String showBug() {
        StringBuilder stringBuilder = new StringBuilder('A');
        return stringBuilder.toString(); // Mutant code: Renamed'sb' to'stringBuilder'
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}