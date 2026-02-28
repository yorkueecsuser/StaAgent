class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');

        // Dead Store Mutant: Adding an unused variable declaration
        int deadStoreVariable = 10;

        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}