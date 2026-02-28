class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This line should never be executed");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}