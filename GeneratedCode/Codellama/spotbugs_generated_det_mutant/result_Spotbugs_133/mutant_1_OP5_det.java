// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int smccvppc = 0;switch  (smccvppc) {case 1:byte drpcpqrr = 69;break;default:byte ecxpuqbj = 45;break;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}