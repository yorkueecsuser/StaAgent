class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        StringBuilder ab = sb; // Mutated code: Renaming the variable from'sb' to 'ab'
        return ab.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}