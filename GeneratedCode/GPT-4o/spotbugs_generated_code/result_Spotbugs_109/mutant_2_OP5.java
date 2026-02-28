class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        int resultIncrement = buggyMethodIncrement(5);
        int resultDecrement = buggyMethodDecrement(5);
        
        System.out.println("Result of buggyMethodIncrement: " + resultIncrement);
        System.out.println("Result of buggyMethodDecrement: " + resultDecrement);

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // This case will never be true with the current implementation of getUnreachableValue()
                System.out.println("This message is unreachable.");
                break;
            default:
                // Default case to ensure no compile errors
                break;
        }
    }

    // Simulated method to provide a dynamic value for the switch statement
    public int getUnreachableValue() {
        return 0; // Value ensuring the switch case is unreachable
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}