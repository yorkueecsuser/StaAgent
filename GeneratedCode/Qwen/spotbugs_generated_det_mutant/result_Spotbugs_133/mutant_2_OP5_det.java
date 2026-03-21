import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int kxscmfzs = 0;switch  (kxscmfzs) {case 1:int ksmzpyin = 772690805;break;default:String bdizcfmx = "dxgpaalh";break;}
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}