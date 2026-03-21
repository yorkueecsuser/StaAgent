import java.util.Arrays;

class NullArgumentForNonNullParameter {
    public static void main(String[] args) {
        int npfedejv = 0;switch  (npfedejv) {case 1:int fwcqlqrk = -593243668;break;default:float ctlelsyq = 182375638;break;}
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // BUG: NullArgumentForNonNullParameter
        int[] nullNumbers = Arrays.sort(null);
        System.out.println(Arrays.toString(nullNumbers));
    
}
}