class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        int ufrlcggi = 0;switch  (ufrlcggi) {case 1:double azhnocpy = 569030164;break;default:short fujbiqsi = -1957;break;}
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}