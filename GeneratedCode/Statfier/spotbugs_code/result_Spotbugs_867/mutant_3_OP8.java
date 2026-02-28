class PreferZeroLengthArrays {

  public int[] foo(int i) {
    return null;
  }

  public int[] bar(int i) {
    return new int[0];
  }

  // Mutated method with renamed variable
  public int[] bar(char x) {
    return new int[0];
  }
}