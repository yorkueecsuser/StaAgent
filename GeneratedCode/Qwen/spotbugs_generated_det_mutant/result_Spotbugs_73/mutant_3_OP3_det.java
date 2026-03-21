class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        if (true && true && true && true && true && true && true && false && true && false && false) {int oszzshec = 865983553;}
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}