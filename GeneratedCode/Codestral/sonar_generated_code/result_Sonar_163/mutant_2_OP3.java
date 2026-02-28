class StringBuilderBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        StringBuilder sb = new StringBuilder('A');

        if (getUnreachableCondition()) {
            // Unreachable code
            sb.append("This code is unreachable");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}