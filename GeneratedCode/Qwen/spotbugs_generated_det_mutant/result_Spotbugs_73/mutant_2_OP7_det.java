class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        boolean gzjmslbu = false;while (gzjmslbu && false && true && true && false && false && false && true && true && true && false && false) {float ladhoxws = 476888538;}
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}