// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int wilyhtyh = 0;switch  (wilyhtyh) {case 1:byte iultvadx = 99;break;default:double txftwced = -533920117;break;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}