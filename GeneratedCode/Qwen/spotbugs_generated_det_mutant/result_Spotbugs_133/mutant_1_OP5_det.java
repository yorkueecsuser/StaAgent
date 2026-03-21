import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int pvweockw = 0;switch  (pvweockw) {case 1:byte azvgufej = -16;break;default:char ptxqoudp = 'n';break;}
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}