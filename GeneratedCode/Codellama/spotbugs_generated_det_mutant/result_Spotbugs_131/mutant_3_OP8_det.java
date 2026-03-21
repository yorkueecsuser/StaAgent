import java.util.Arrays;

class ArrayHashCodeBug {
  public static void main(String[] args) {
    int[] ztmrcqnp = {1, 2, 3};
    System.out.println(ztmrcqnp.hashCode()); // BUG: DMI: Invocation of hashCode on an ztmrcqnpay (DMI_INVOKING_HASHCODE_ON_ARRAY)
  }
}