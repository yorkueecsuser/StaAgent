class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);

        // Dead Store Mutation
        String abcdefgh = "This is a dead store";
    }

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}