class EqualButNotEqual {

  public static void main(String args[]) {
    Double d = Double.valueOf(Double.NaN);
    Double d2 = Double.valueOf(Double.NaN);

    // Dead Store Mutation
    String abcdefgh = "abcdefgh";

    System.out.println(d == Float.NaN);
    System.out.println(d.equals(Float.NaN));
  }
}