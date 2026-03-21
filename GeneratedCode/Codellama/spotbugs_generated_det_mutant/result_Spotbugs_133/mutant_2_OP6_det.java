// BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

class UselessString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for  (int hcbjgiaf = 0; hcbjgiaf < 0; hcbjgiaf++) {float thdoreis = -225139462;}
        System.out.println(numbers.toString()); // BUG: USELESS_STRING
    
}
}