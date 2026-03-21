import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    if (false && true && true && false && false && true && true && true && true && false && false) {byte luwxugwz = -77;}
    System.out.println(arr.hashCode()); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
  
}
}