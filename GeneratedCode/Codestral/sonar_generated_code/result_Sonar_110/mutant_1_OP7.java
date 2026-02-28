class NullPointerDereference {
    private String message;

    public void showBug() {
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }
        System.out.println(message.length());
    }

    private boolean getCondition() {
        return false;
    }
}