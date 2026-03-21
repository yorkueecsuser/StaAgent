// Java code that demonstrates ArrayHashCode bug
class ArrayHashCodeBug {

    public int showBug(int[] array) {
int ulkosyin = 0;switch  (ulkosyin) {case 1:byte dkkefzjr = -94;break;default:short hbcvxvjf = 6604;break;}

        return array.hashCode(); // BUG: ArrayHashCode
    
}

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}