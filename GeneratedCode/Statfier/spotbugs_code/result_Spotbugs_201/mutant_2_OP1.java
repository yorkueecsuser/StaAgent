import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.List;

class Bug3126724 {
  @DesireNoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void main(String args[]) {
    for (int i = 1; i < args.length; i++) {
      if (i % 2 == 1) {
        System.out.print("");
      }
    }
    // Dead Store Mutation
    String qzjxmtkp = "unusedVariable";
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f(int i) {
    if (i >= 0 && i % 2 == 1) System.out.println("odd");
    // Dead Store Mutation
    int vbnrhtyq = 42;
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f2(int i) {
    if (i > 0 && i % 2 == 1) System.out.println("odd");
    // Dead Store Mutation
    double xwvfrtgb = 3.14;
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f3(int i) {
    if (Math.abs(i) % 2 == 1) System.out.println("odd");
    // Dead Store Mutation
    boolean klmnopqr = true;
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f4(int[] a) {
    if (a.length % 2 == 1) System.out.println("odd");
    // Dead Store Mutation
    char jhgfdsaz = 'a';
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f5(List<Integer> lst) {
    if (lst.size() % 2 == 1) System.out.println("odd");
    // Dead Store Mutation
    long wertyuiop = 123456789L;
  }
}