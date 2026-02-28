class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This will never be printed: " + i);
        }
    }

    private boolean getCondition() {
        // Always return false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}