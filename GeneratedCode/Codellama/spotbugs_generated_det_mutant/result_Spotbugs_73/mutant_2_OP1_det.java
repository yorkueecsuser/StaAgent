// BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)

class UnrelatedTypesEqualsBug {

    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 5;

        // BUG: s.equals(i) will always return false
        short ucftwacj = 5960;
        System.out.println(s.equals(i));
    
}
}