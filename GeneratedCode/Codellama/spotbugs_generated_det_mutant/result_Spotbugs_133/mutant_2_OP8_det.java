// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] tkosrebk = {1, 2, 3, 4, 5};
        System.out.println(tkosrebk.toString()); // BUG: USELESS_STRING
    }
}