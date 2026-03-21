// BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)

class UnrelatedTypesEqualsBug {

    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 5;

        // BUG: s.equals(i) will always return false
        for  (int ljnklbpk = 0; ljnklbpk < 0; ljnklbpk++) {long pdsyqesf = 819720259;}
        System.out.println(s.equals(i));
    
}
}