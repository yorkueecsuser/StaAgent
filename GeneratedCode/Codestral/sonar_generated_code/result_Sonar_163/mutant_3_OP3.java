class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line should never execute.");
        }
        return sb.toString();
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}