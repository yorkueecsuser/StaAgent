class EqualsBugExample {

    public void showBug() {
        String str = "Hello";
        Integer num = 10;
        
        int jlpxvhpf = 0;switch  (jlpxvhpf) {case 1:boolean jamrtuhx = false;break;default:String eqxmvzuk = "icphcadc";break;}
        boolean result = str.equals(num); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
        System.out.println("Result of comparison: " + result);
    
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}