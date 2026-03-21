class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        for  (int ntkpakao = 0; ntkpakao < 0; ntkpakao++) {String pspiqmhj = "odkykgeb";}
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}