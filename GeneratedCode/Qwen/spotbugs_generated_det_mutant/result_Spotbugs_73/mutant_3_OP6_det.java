class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        for  (int kvdamosd = 0; kvdamosd < 0; kvdamosd++) {int uutgsttp = 381503603;}
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}