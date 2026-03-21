// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (false && true && true && false && true && true && true && false && false && false && false) {float ktllhgcn = -937865845;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}