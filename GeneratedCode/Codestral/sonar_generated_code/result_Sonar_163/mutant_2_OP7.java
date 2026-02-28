class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable statement.");
        }
        return sb.toString();
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}