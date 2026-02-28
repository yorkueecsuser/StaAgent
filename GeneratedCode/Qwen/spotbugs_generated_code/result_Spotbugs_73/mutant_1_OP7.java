class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}