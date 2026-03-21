import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] opakyhzj = {1, 2, 3};
    System.out.println(opakyhzj.hashCode()); // BUG: DMI: Invocation of hashCode on an opakyhzjay (DMI_INVOKING_HASHCODE_ON_ARRAY)
  }
}