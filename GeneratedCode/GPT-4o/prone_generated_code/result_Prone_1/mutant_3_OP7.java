class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        boolean conditionWhile = getCondition(); // Using a method to determine the condition
        while (conditionWhile) { // This loop is unreachable due to the false condition
            System.out.println("This is an unreachable while loop.");
        }
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    private boolean getCondition() {
        return false; // The condition is always false, making the while loop unreachable
    }
}