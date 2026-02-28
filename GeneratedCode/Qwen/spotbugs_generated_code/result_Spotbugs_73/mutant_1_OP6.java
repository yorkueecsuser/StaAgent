class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}