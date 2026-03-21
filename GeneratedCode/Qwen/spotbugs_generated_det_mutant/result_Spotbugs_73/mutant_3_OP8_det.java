class EqualsBugExample {

    public void showBug() {
        String jsndkhfx = "Hello";
        Integer num = 10;
        
        boolean ejewyjtt = jsndkhfx.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + ejewyjtt);
    }

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}