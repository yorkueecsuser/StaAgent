import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int wbmmnfme = 0;switch  (wbmmnfme) {case 1:char jxcodvwz = 'k';break;default:boolean iydfeqbe = false;break;}
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        if (array1.equals(array2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    
}
}