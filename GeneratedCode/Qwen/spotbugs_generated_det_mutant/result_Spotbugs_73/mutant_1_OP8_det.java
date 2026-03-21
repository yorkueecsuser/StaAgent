class EqualsBugExample {

    public void showBug() {
        String ufflxtpp = "Hello";
        Integer num = 10;
        
        boolean yqsvqans = ufflxtpp.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + yqsvqans);
    }

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}