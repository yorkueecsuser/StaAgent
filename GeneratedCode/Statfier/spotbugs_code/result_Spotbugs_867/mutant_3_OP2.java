class PreferZeroLengthArrays {

  public int[] foo(int i) {
    return null;
    return null; // Mutant: duplicated the return statement
  }

  public int[] bar(int i) {
    return new int[0];
    return new int[0]; // Mutant: duplicated the return statement
  }
}