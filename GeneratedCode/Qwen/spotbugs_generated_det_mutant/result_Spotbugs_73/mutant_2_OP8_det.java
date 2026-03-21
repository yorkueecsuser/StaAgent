class EqualsBugExample {

    public void showBug() {
        String cacffuzq = "Hello";
        Integer num = 10;
        
        boolean syggoimg = cacffuzq.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + syggoimg);
    }

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}