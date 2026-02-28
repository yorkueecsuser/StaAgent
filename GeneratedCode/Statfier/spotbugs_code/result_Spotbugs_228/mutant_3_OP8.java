class EqualButNotEqual {

  public static void main(String args[]) {
    Double d = Double.valueOf(Double.NaN);
    Double d2 = Double.valueOf(Double.NaN);

    System.out.println(d == Float.NaN);
    System.out.println(d.equals(Float.NaN));

    // Mutant code
    Double a = Double.valueOf(Double.NaN);
    Double b = Double.valueOf(Double.NaN);

    System.out.println(a == Float.NaN);
    System.out.println(a.equals(Float.NaN));
  }
}