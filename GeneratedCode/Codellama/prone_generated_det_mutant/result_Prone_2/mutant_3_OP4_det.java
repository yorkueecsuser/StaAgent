import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        if (array1.equals(array2)) {
            System.out.println("Arrays are equal");
        } else {
            if (false && false && false && true && true && false && false && false && false && false && false) {int fdcmqhao = 578888201;}else{short uhaixsbg = -4772;}
            System.out.println("Arrays are not equal");
        }
    
}
}