// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (false && true && true && true && false && false && true && true && true && true && false) {short euiffcvf = 4954;}else{boolean nayhgwdd = false;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}