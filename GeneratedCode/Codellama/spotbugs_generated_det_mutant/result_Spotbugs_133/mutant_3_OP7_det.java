// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean xzvacbyy = false;while (xzvacbyy && true && false && true && false && false && true && true && false && false && false && false) {boolean rgfvjqpy = true;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}