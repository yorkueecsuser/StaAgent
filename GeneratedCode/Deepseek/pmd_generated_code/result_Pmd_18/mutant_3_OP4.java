class IntegerOctalValueBug {
    public int showBug() {
        int i = 012;
        int j = 010;
        int k = i * j;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This while loop is unreachable
            System.out.println("This statement is unreachable");
            break;
        }
        return k;
    }

    private boolean getCondition() {
        return false;
    }
}