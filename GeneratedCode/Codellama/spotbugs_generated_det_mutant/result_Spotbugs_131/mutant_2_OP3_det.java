import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    if (true && true && true && false && true && false && true && false && true && false && false) {long oygpjzxo = -975454393;}
    System.out.println(arr.hashCode()); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
  
}
}