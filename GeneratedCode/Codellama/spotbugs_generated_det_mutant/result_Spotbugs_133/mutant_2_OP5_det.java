// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int rrjiqtwj = 0;switch  (rrjiqtwj) {case 1:String ljqjaacf = "nmfprclq";break;default:float vgxxemtj = -29488131;break;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}