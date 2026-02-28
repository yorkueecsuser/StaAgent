class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');

        // Mutation: Introducing unreachable switch statement
        boolean condition = false; // Always evaluates to false
        if (condition) {
            int value = 1;
            switch(value) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}