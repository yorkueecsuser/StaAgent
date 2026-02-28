class PreferZeroLengthArrays {

  public int[] foo(int i) {
    return null;
    // Mutant: Duplicate the return statement
    return null;
  }

  public int[] bar(int i) {
    return new int[0];
    // Mutant: Duplicate the return statement
    return new int[0];
  }
}