import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }
    
    // Mutated code
    String b = "example";
    if (b.equals("example")) {
      // This is just an additional check to demonstrate the renaming mutation
    }
  }
}