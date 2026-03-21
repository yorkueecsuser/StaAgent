import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    boolean vsibmsaz = false;while (vsibmsaz && false && true && true && false && false && true && false && true && false && true && false) {String hxglvlfz = "irtdsohy";}
    System.out.println(arr.hashCode()); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
  
}
}