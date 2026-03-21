// BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)

class UnrelatedTypesEqualsBug {

    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 5;

        // BUG: s.equals(i) will always return false
        if (true && false && true && true && true && true && false && false && false && false && false) {float krjijwgt = 237134958;}
        System.out.println(s.equals(i));
    
}
}