class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        int unreachableCondition = getCondition(); // non-final variable to determine the switch condition
        switch (unreachableCondition) {
            case 1:
                // Unreachable code
                System.out.println("This will never print.");
                break;
            default:
                break;
        }
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    // Method to simulate dynamic condition
    private int getCondition() {
        return 0; // Ensures the switch statement is unreachable
    }
}