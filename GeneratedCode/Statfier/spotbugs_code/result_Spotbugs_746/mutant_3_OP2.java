import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    int dummy = 0; // Introduced a dummy variable and assignment
    int dummy = 0; // Duplicate of the above assignment

    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }
  }
}