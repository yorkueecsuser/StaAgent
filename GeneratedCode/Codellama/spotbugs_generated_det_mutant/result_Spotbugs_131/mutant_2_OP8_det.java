import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] vwssllul = {1, 2, 3};
    System.out.println(vwssllul.hashCode()); // BUG: DMI: Invocation of hashCode on an vwssllulay (DMI_INVOKING_HASHCODE_ON_ARRAY)
  }
}