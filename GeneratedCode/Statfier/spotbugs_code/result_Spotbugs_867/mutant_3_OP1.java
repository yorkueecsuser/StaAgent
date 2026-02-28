class PreferZeroLengthArrays {

  public int[] foo(int i) {
    // Dead Store Mutation
    int abcdefgh = 42; // Unused variable declaration
    return null;
  }

  public int[] bar(int i) {
    // Dead Store Mutation
    String ijklmnop = "unused"; // Unused variable declaration
    return new int[0];
  }
}