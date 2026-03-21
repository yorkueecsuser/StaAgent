class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        if (true && false && true && true && true && false && true && true && false && true && false) {float qdwdmlse = 679446911;}
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}