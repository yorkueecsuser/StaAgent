class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;
        int j = 010;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This if block is unreachable, as the condition is always false
            System.out.println("This is unreachable code");
        }
        return i * j;
    }
}