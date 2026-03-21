// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean dmdvtzwi = false;while (dmdvtzwi && false && true && false && false && true && false && false && true && false && true && false) {char ugnozgbw = 'd';}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}