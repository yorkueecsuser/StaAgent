class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');

        boolean isUnreachable = getUnreachableCondition(); // Dynamic condition to make the branch unreachable
        if (isUnreachable) {
            // Unreachable branch
            return "Unreachable";
        } else {
            return sb.toString();
        }
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}