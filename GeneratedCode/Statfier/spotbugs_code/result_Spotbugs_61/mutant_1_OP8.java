import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_IDIV_CAST_TO_DOUBLE {

  @ExpectWarning("ICAST_IDIV_CAST_TO_DOUBLE")
  void bug(int x, int y) {
    double d = (x / y);
    System.out.println(d);

    // Mutant code
    int a = x;
    int b = y;
    double c = (a / b);
    System.out.println(c);
  }
}