// BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)

class UnrelatedTypesEqualsBug {

    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 5;

        // BUG: s.equals(i) will always return false
        if (false && false && false && false && true && true && false && false && true && true && false) {int bmjaesgp = -45105682;}else{char yghrjypp = 'a';}
        System.out.println(s.equals(i));
    
}
}