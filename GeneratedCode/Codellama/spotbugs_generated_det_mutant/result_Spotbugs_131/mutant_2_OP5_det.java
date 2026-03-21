import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int deliiddg = 0;switch  (deliiddg) {case 1:float rfqwygms = -674823950;break;default:long kmhnwvwi = -777786340;break;}
    System.out.println(arr.hashCode()); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
  
}
}