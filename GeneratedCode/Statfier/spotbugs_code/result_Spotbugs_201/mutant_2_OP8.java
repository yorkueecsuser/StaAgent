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
    // Mutant: Renaming variable 'i' to 'x'
    for (int x = 1; x < args.length; x++) {
      if (x % 2 == 1) {
        System.out.print("");
      }
    }
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f(int i) {
    if (i >= 0 && i % 2 == 1) System.out.println("odd");
    // Mutant: Renaming variable 'i' to 'j'
    int j = i;
    if (j >= 0 && j % 2 == 1) System.out.println("odd");
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f2(int i) {
    if (i > 0 && i % 2 == 1) System.out.println("odd");
    // Mutant: Renaming variable 'i' to 'k'
    int k = i;
    if (k > 0 && k % 2 == 1) System.out.println("odd");
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f3(int i) {
    if (Math.abs(i) % 2 == 1) System.out.println("odd");
    // Mutant: Renaming variable 'i' to 'l'
    int l = i;
    if (Math.abs(l) % 2 == 1) System.out.println("odd");
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f4(int[] a) {
    if (a.length % 2 == 1) System.out.println("odd");
    // Mutant: Renaming variable 'a' to 'b'
    int[] b = a;
    if (b.length % 2 == 1) System.out.println("odd");
  }

  @NoWarning("IM_BAD_CHECK_FOR_ODD")
  public static void f5(List<Integer> lst) {
    if (lst.size() % 2 == 1) System.out.println("odd");
    // Mutant: Renaming variable 'lst' to 'lst2'
    List<Integer> lst2 = lst;
    if (lst2.size() % 2 == 1) System.out.println("odd");
  }
}