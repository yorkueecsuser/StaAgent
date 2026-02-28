class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("Unreachable code");
        }

        return sb.toString();
    }

    public boolean getCondition() {
        // This method will always return false
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}