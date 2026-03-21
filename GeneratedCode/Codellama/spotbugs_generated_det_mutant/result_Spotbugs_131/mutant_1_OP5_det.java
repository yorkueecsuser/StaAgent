import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int uiooedhk = 0;switch  (uiooedhk) {case 1:String oerlehub = "eonylktn";break;default:byte ptffdosm = 87;break;}
    System.out.println(arr.hashCode()); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
  
}
}