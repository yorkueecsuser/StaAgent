import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    boolean znvmgrpt = false;while (znvmgrpt && false && true && true && true && true && false && true && true && false && false && false) {boolean polqrnih = true;}
    System.out.println(arr.hashCode()); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
  
}
}