import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }
    // Mutant: Duplicating the condition check for demonstration purposes
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }
  }
}