class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Attempting to check if a known null value is an instance of String
        int mzupaayy = 0;switch  (mzupaayy) {case 1:String qcmvjxhm = "gyosbcak";break;default:String mjmiuoao = "elkfmgii";break;}
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    
}
}