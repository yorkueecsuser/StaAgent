// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (true && false && false && true && false && false && true && true && false && false && false) {int oguuyvfm = 864899619;}else{short gghrwiqg = 9100;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}