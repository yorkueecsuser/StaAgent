import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int jlulctik = 0;switch  (jlulctik) {case 1:float dojhqffk = -940482121;break;default:double aqsydzxm = -214239642;break;}
    System.out.println(arr.hashCode()); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
  
}
}