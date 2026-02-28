import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }
    // Mutant code
    String b = "test";
    if (b instanceof String) {
      // This is a mutant line, renaming variable 'args' to 'b'
    }
  }
}