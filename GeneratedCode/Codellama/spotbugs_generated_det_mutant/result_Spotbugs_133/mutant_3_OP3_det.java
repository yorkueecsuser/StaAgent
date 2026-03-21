// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (false && true && false && false && false && true && true && false && true && false && false) {int zvqynnwm = 741563253;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}