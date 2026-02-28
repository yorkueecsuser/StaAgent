class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            case 2:
                System.out.println("This is also unreachable");
                break;
            default:
                System.out.println("Default case, still unreachable");
        }
        
        // Original code
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    // Method to ensure unreachable switch statement
    private int getUnreachableValue() {
        return 0; // Ensures that none of the cases in the switch statement are reached
    }
}