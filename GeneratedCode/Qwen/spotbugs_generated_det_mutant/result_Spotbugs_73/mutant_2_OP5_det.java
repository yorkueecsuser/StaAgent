class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        int jlcmgria = 0;switch  (jlcmgria) {case 1:String xichyaea = "bjnxbyaz";break;default:int aesjzgwk = 633804535;break;}
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}