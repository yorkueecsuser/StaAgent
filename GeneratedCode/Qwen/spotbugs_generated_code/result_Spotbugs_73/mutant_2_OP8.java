class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);

        // Mutated code with renaming operator
        String a = "World";
        Integer b = 20;
        
        boolean c = a.equals(b); // Mutated bug: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Mutated Result of comparison: " + c);
    }

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}